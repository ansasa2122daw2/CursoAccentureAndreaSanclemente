package es.rf.tienda.dominio;

import java.time.LocalDate;
import java.util.List;

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
	private LocalDate fec_Desacti;			//fecha desactivacion
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
	
	/**
	 * Constructor
	 */
	public Producto() {
		super();
	}
	
	/**
	 * Getters y setters
	 * @return
	 */

	public String getId_producto() {
		return id_producto;
	}

	public void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}

	public String getPro_descripcion() {
		return pro_descripcion;
	}

	public void setPro_descripcion(String pro_descripcion) {
		this.pro_descripcion = pro_descripcion;
	}

	public String getPro_desLarga() {
		return pro_desLarga;
	}

	public void setPro_desLarga(String pro_desLarga) {
		this.pro_desLarga = pro_desLarga;
	}

	public double getPro_precio() {
		return pro_precio;
	}

	public void setPro_precio(double pro_precio) {
		this.pro_precio = pro_precio;
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

	public void setPro_fecRepos(LocalDate pro_fecRepos) {
		this.pro_fecRepos = pro_fecRepos;
	}

	public LocalDate getPro_fecActi() {
		return pro_fecActi;
	}

	public void setPro_fecActi(LocalDate pro_fecActi) {
		this.pro_fecActi = pro_fecActi;
	}

	public LocalDate getFec_Desacti() {
		return fec_Desacti;
	}

	public void setFec_Desacti(LocalDate fec_Desacti) {
		this.fec_Desacti = fec_Desacti;
	}

	public String getPro_uniVenta() {
		return pro_uniVenta;
	}

	public void setPro_uniVenta(String pro_uniVenta) {
		this.pro_uniVenta = pro_uniVenta;
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

	public void setId_pais(int id_pais) {
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

	public void setId_categoria(int id_categoria) {
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

	public void setPro_stat(char pro_stat) {
		this.pro_stat = pro_stat;
	}

	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", pro_descripcion=" + pro_descripcion + ", pro_desLarga="
				+ pro_desLarga + ", pro_precio=" + pro_precio + ", pro_stock=" + pro_stock + ", pro_fecRepos="
				+ pro_fecRepos + ", pro_fecActi=" + pro_fecActi + ", fec_Desacti=" + fec_Desacti + ", pro_uniVenta="
				+ pro_uniVenta + ", pro_cantXUniVenta=" + pro_cantXUniVenta + ", pro_uniUltNivel=" + pro_uniUltNivel
				+ ", id_pais=" + id_pais + ", pro_usoRecomendado=" + pro_usoRecomendado + ", id_categoria="
				+ id_categoria + ", pro_stkReservado=" + pro_stkReservado + ", pro_nStkAlto=" + pro_nStkAlto
				+ ", pro_nStkBajo=" + pro_nStkBajo + ", pro_stat=" + pro_stat + "]";
	}

}