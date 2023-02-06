package es.rf.tienda.dominio;

import java.time.LocalDate;
import java.util.List;

import es.rf.tienda.exception.DomainException;
import es.rf.tienda.util.Validator;

/**
 * Nombre: Producto
 * Descipcion: Clase Producto
 * @author andrea.sanclemente
 *
 */

public class Producto {
	private String id_producto;				//código del producto
	private String pro_descripcion;			//descripcion corta
	private String pro_desLarga;			//explicacion
	private double pro_precio;				//precio
	private int pro_stock;					//stock
	private LocalDate pro_fecRepos;			//fecha prevista reposicion
	private LocalDate pro_fecActi;			//fecha activacion
	private LocalDate pro_fecDesacti;		//fecha desactivacion
	private String pro_uniVenta;			//unidad de venta
	private double pro_cantXUniVenta;		//cantidad de unidades ultimas
	private String pro_uniUltNivel;			//unidad ultima
	private int id_pais;					//Pais de origen
	private String pro_usoRecomendado;		//Uso recomendado
	private int id_categoria;				//Categoria
	private int pro_stkReservado;			//Stock reservado
	private int pro_nStkAlto;				//stock para nivel alto
	private int pro_nStkBajo;				//stock para nivel bajo
	private char pro_stat;					//estado
	
	final static int CUMPLEMIN_0 = 0;
	final static int CUMPLEMIN_1 = 1;
	final static int CUMPLEMIN_5 = 5;
	final static int CUMPLEMIN_10 = 10;
	final static int CUMPLEMAX_100 = 100;
	final static int CUMPLEMAX_2000 = 2000;
	
	
	/**
	 * Constructor tiene que llamar a los setters
	 */
	public Producto() {
		super();
	}
	
	/**
	 * Getters y setters +  métodos Validators
	 * @return
	 */

	public String getId_producto() {
		return id_producto;
	}

	public void setId_producto(String id_producto) throws DomainException {
		if(Validator.filtroProducto(id_producto) && Validator.cumpleLongitud(id_producto, CUMPLEMIN_5, CUMPLEMIN_5)) {
			this.id_producto = id_producto;
		}else {
            throw new DomainException();
		}
	}

	public String getPro_descripcion() {
		return pro_descripcion;
	}

	public void setPro_descripcion(String pro_descripcion) throws DomainException {
		if(Validator.cumpleLongitud(pro_descripcion, CUMPLEMIN_5, CUMPLEMAX_100)) { 
			this.pro_descripcion = pro_descripcion;
		}else {
            throw new DomainException();
		}
	}

	public String getPro_desLarga() {
		return pro_desLarga;
	}

	public void setPro_desLarga(String pro_desLarga) throws DomainException {
		if(Validator.cumpleLongitud(pro_desLarga, CUMPLEMIN_5, CUMPLEMAX_2000)) {
			this.pro_desLarga = pro_desLarga;
		}else {
            throw new DomainException();
		}
	}

	public double getPro_precio() {
		return pro_precio;
	}

	public void setPro_precio(double pro_precio) throws DomainException {
		if(Validator.cumpleRango(pro_precio, CUMPLEMIN_0, CUMPLEMAX_100)) {
			this.pro_precio = pro_precio;
		}else {
            throw new DomainException();
		}
	}

	public int getPro_stock() {
		return pro_stock;
	}

	public void setPro_stock(int pro_stock) {
		this.pro_stock = pro_stock;
	}

	public LocalDate getPro_fecRepos() {
		return pro_fecRepos;
	}

	public void setPro_fecRepos(LocalDate pro_fecRepos) throws DomainException {
		if(Validator.valDateMax(pro_fecRepos, LocalDate.now())){
			this.pro_fecRepos = pro_fecRepos;
		}else {
            throw new DomainException();
		}
	}

	public LocalDate getPro_fecActi() {
		return pro_fecActi;
	}

	public void setPro_fecActi(LocalDate pro_fecActi) throws DomainException {
		if(Validator.valDateMax(pro_fecRepos, LocalDate.now())){
			this.pro_fecActi = pro_fecActi;
		}else {
            throw new DomainException();
		}
	}

	public LocalDate getPro_FecDesacti() {
		return pro_fecDesacti;
	}

	public void setPro_FecDesacti(LocalDate pro_fecDesacti) throws DomainException { //revisar
		if(getPro_fecActi() != null) {
			Validator.valDateMax(pro_fecDesacti, pro_fecActi);
			this.pro_fecDesacti = pro_fecDesacti;
		}else if(Validator.valDateMax(pro_fecDesacti, LocalDate.now())) {
			this.pro_fecDesacti = pro_fecDesacti;
		}else {
            throw new DomainException();
		}
		
	}

	public String getPro_uniVenta() {
		return pro_uniVenta;
	}

	public void setPro_uniVenta(String pro_uniVenta) throws DomainException {
		if(Validator.isAlfanumeric(pro_uniVenta) && Validator.cumpleLongitud(pro_uniVenta, CUMPLEMIN_1, CUMPLEMIN_10)) {
			this.pro_uniVenta = pro_uniVenta;
		}else {
            throw new DomainException();
		}
	}

	public double getPro_cantXUniVenta() {
		return pro_cantXUniVenta;
	}

	public void setPro_cantXUniVenta(double pro_cantXUniVenta) {
		this.pro_cantXUniVenta = pro_cantXUniVenta;
	}

	public String getPro_uniUltNivel() {
		return pro_uniUltNivel;
	}

	public void setPro_uniUltNivel(String pro_uniUltNivel) {
		this.pro_uniUltNivel = pro_uniUltNivel;
	}

	public int getId_pais() { 
		return id_pais;
	}

	public void setId_pais(int id_pais) { // Existencia en lista paises (Base de datos)
		this.id_pais = id_pais;
	}

	public String getPro_usoRecomendado() {
		return pro_usoRecomendado;
	}

	public void setPro_usoRecomendado(String pro_usoRecomendado) {
		this.pro_usoRecomendado = pro_usoRecomendado;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) { // Existencia en lista paises (Base de datos)
		this.id_categoria = id_categoria;
	}

	public int getPro_stkReservado() {
		return pro_stkReservado;
	}

	public void setPro_stkReservado(int pro_stkReservado) {
		this.pro_stkReservado = pro_stkReservado;
	}

	public int getPro_nStkAlto() {
		return pro_nStkAlto;
	}

	public void setPro_nStkAlto(int pro_nStkAlto) {
		this.pro_nStkAlto = pro_nStkAlto;
	}

	public int getPro_nStkBajo() {
		return pro_nStkBajo;
	}

	public void setPro_nStkBajo(int pro_nStkBajo) {
		this.pro_nStkBajo = pro_nStkBajo;
	}

	public char getPro_stat() {
		return pro_stat;
	}

	public void setPro_stat(char pro_stat) { // Rando Base de datos A o B
		this.pro_stat = pro_stat;
	}

	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", pro_descripcion=" + pro_descripcion + ", pro_desLarga="
				+ pro_desLarga + ", pro_precio=" + pro_precio + ", pro_stock=" + pro_stock + ", pro_fecRepos="
				+ pro_fecRepos + ", pro_fecActi=" + pro_fecActi + ", pro_fecDesacti=" + pro_fecDesacti + ", pro_uniVenta="
				+ pro_uniVenta + ", pro_cantXUniVenta=" + pro_cantXUniVenta + ", pro_uniUltNivel=" + pro_uniUltNivel
				+ ", id_pais=" + id_pais + ", pro_usoRecomendado=" + pro_usoRecomendado + ", id_categoria="
				+ id_categoria + ", pro_stkReservado=" + pro_stkReservado + ", pro_nStkAlto=" + pro_nStkAlto
				+ ", pro_nStkBajo=" + pro_nStkBajo + ", pro_stat=" + pro_stat + "]";
	}

}
