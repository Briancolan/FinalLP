/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Persona;
import Modelo.Area;
import Modelo.Rol;
import ModeloDAO.PersonaDAO;
import ModeloDAO.AreaDAO;
import ModeloDAO.RolDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {
    
    String listarpersona = "Vista/ListarPersona.jsp";
    String agregarpersona = "Vista/AgregarPersona.jsp";
    String editarpersona = "Vista/EditarPersona.jsp";
    
    String listararea = "Vista/ListarArea.jsp";
    String agregararea = "Vista/AgregarArea.jsp";
    String editararea = "Vista/EditarArea.jsp";
    
    String listarrol = "Vista/ListarRol.jsp";
    String agregarrol = "Vista/AgregarRol.jsp";
    String editarrol = "Vista/EditarRol.jsp";
    
    String listarsugerencia = "Vista/ListarSugerencia.jsp";
    String agregarsugerencia = "Vista/AgregarSugerencia.jsp";
    String editarsugerencia = "Vista/EditarSugerencia.jsp";
    
    Persona persona = new Persona();
    PersonaDAO personaDAO = new PersonaDAO();
    
    Area area = new Area();
    AreaDAO areaDAO = new AreaDAO();
    
    Rol rol = new Rol();
    RolDAO rolDAO = new RolDAO();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String acceso="";
        //-----------------PERSONA------------------------------//
        String s_accion = request.getParameter("f_accion");
        if (s_accion.equalsIgnoreCase("listarpersona")) {
            acceso = listarpersona;
        }else if (s_accion.equalsIgnoreCase("agregarpersona01")) {
            acceso = agregarpersona;
        }else if(s_accion.equalsIgnoreCase("agregarpersona02")){
            String s_nombre = request.getParameter("f_nombre");
            String s_apellidos = request.getParameter("f_apellidos");
            String s_dni = request.getParameter("f_dni");
            String s_direccion = request.getParameter("f_direccion");
            String s_estado = request.getParameter("f_estado");
            persona.setNombre(s_nombre);
            persona.setApellidos(s_apellidos);
            persona.setDni(s_dni);
            persona.setDireccion(s_direccion);
            persona.setEstado(s_estado);
            personaDAO.agregarpersona(persona);
            acceso = listarpersona;
        }else if (s_accion.equalsIgnoreCase("editarpersona01")) {
            request.setAttribute("f_idpersona", request.getParameter("f_idpersona"));
            acceso = editarpersona;
        }else if (s_accion.equalsIgnoreCase("editarpersona02")) {
            int s_idpersona = Integer.valueOf(request.getParameter("f_idpersona"));
            String s_nombre = request.getParameter("f_nombre");
            String s_apellidos = request.getParameter("f_apellidos");
            String s_dni = request.getParameter("f_dni");
            String s_direccion = request.getParameter("f_direccion");
            String s_estado = request.getParameter("f_estado");
            persona.setIdpersona(s_idpersona);
            persona.setNombre(s_nombre);
            persona.setApellidos(s_apellidos);
            persona.setDni(s_dni);
            persona.setDireccion(s_direccion);
            persona.setEstado(s_estado);
            personaDAO.editarpersona(persona);
            
            acceso = listarpersona;
        }else if (s_accion.equalsIgnoreCase("eliminarpersona")) {
            int s_idpersona = Integer.valueOf(request.getParameter("f_idpersona"));
            personaDAO.eliminarpersona(s_idpersona);
            acceso = listarpersona;
        }
            
        
        //----------------------FIN DE PERSONA------------------------//
        
        //----------------------AREA---------------------------------//
        
        
        if (s_accion.equalsIgnoreCase("listararea")) {
            acceso = listararea;
        }else if (s_accion.equalsIgnoreCase("agregararea01")) {
            acceso = agregararea;
        }else if(s_accion.equalsIgnoreCase("agregararea02")){
            String s_nombre = request.getParameter("f_nombre");
            String s_estado = request.getParameter("f_estado");
            area.setNombre(s_nombre);
            area.setEstado(s_estado);
            areaDAO.agregararea(area);
            acceso = listararea;
        }else if (s_accion.equalsIgnoreCase("editararea01")) {
            request.setAttribute("f_idarea", request.getParameter("f_idarea"));
            acceso = editararea;
        }else if (s_accion.equalsIgnoreCase("editararea02")) {
            int s_idarea = Integer.valueOf(request.getParameter("f_idarea"));
            String s_nombre = request.getParameter("f_nombre");
            String s_estado = request.getParameter("f_estado");
            area.setIdarea(s_idarea);
            area.setNombre(s_nombre);
            area.setEstado(s_estado);
            areaDAO.editararea(area);
            
            acceso = listararea;
        }else if (s_accion.equalsIgnoreCase("eliminararea")) {
            int s_idarea = Integer.valueOf(request.getParameter("f_idarea"));
            areaDAO.eliminararea(s_idarea);
            acceso = listararea;
        }
        
        //-------------------FIN DE AREA------------------------------//
        //----------------------ROL---------------------------------//
        
        if (s_accion.equalsIgnoreCase("listarrol")) {
            acceso = listarrol;
        }else if (s_accion.equalsIgnoreCase("agregarrol01")) {
            acceso = agregarrol;
        }else if(s_accion.equalsIgnoreCase("agregarrol02")){
            String s_nombre = request.getParameter("f_nombre");
            String s_estado = request.getParameter("f_estado");
            rol.setNombre(s_nombre);
            rol.setEstado(s_estado);
            rolDAO.agregarrol(rol);
            acceso = listarrol;
        }else if (s_accion.equalsIgnoreCase("editarrol01")) {
            request.setAttribute("f_idrol", request.getParameter("f_idrol"));
            acceso = editarrol;
        }else if (s_accion.equalsIgnoreCase("editarrol02")) {
            int s_idrol = Integer.valueOf(request.getParameter("f_idrol"));
            String s_nombre = request.getParameter("f_nombre");
            String s_estado = request.getParameter("f_estado");
            rol.setIdrol(s_idrol);
            rol.setNombre(s_nombre);
            rol.setEstado(s_estado);
            rolDAO.editarrol(rol);
            
            acceso = listarrol;
        }else if (s_accion.equalsIgnoreCase("eliminarrol")) {
            int s_idrol = Integer.valueOf(request.getParameter("f_idrol"));
            rolDAO.eliminarrol(s_idrol);
            acceso = listarrol;
        }
        
        //-------------------FIN DE ROL------------------------------//
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
