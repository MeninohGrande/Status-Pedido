package revisao;

import java.text.SimpleDateFormat;
import java.util.Date;

import revisao.enums.StatusPedido;

public class Pedido {

private	Integer id;
private Date momento;
private StatusPedido status;


public Pedido() {}


public Pedido(Integer id, Date momento, StatusPedido status) {
	super();
	this.id = id;
	this.momento = momento;
	this.status = status;
}


public Integer getId() {
	return id;
}


public void setId(Integer id) {
	this.id = id;
}


public Date getMomento() {
	return momento;
}


public void setMomento(Date momento) {
	this.momento = momento;
}


public StatusPedido getStatus() {
	return status;
}


public void setStatus(StatusPedido status) {
	this.status = status;
}




@Override
public String toString() {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	return "Pedido [id = " + id + ", momento = " + sdf.format(momento) + ", status = " + status + "]";
}


public static void main(String[] args) {
	
	Pedido pedido = new Pedido(1080, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);
	
	System.out.println("Pedido 1 = " + pedido.toString());
	
	Pedido pedido2 = new Pedido(1081, new Date(), StatusPedido.valueOf("ENTREGUE"));
	
	System.out.println("Pedido 2 = " + pedido2.toString());
	
	
}
	
}
