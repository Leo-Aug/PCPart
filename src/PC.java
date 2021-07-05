import java.util.Scanner;
public class PC implements CPUInterface, DiskInterface, MemoryInterface {

    private String cpu;
    private String disk;
    private String memory;

    public PC(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入CPU 内存 硬盘：");
        cpu = input.next();
        memory = input.next();
        disk = input.next();
        input.close();
    }

    public void print_information(){
        System.out.println("你选择了CPU为 "+cpu+" 内存为 "+memory+" 硬盘为 "+disk+"的电脑");
    }

    @Override
    public String getCPU() {
        return cpu;
    }
    @Override
    public String getDisk() {
        return disk;
    }
    @Override
    public String getMemory() {
        return memory;
    }
}
