/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import org.lcsim.util.Driver;
import org.lcsim.event.EventHeader;
/**
 *
 * @author agias
 */
public class crappydriver extends Driver {
    
    Driver crap;
    boolean fuck;
    public void runOnce(){
        crap = new crappyprocessor();
        this.add(crap);
        fuck=true;
    }
    protected void process(EventHeader event){
        if(!fuck){
            this.runOnce();
        }
        this.processChildren(event);
    }
}