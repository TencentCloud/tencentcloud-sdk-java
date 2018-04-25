package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Inbound  extends AbstractModel{


    /**
    * 策略，ACCEPT或者DROP
    */
    @SerializedName("Action")
    @Expose
    private String Action;
    

    /**
    * 来源Ip或Ip段，例如192.168.0.0/16
    */
    @SerializedName("CidrIp")
    @Expose
    private String CidrIp;
    

    /**
    * 端口
    */
    @SerializedName("PortRange")
    @Expose
    private String PortRange;
    

    /**
    * 网络协议，支持udp、tcp等
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;
    

    /**
    * 规则限定的方向，进站规则为INPUT
    */
    @SerializedName("Dir")
    @Expose
    private String Dir;
    

    /**
     * 获取策略，ACCEPT或者DROP
     * @return Action 策略，ACCEPT或者DROP
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * 设置策略，ACCEPT或者DROP
     * @param Action 策略，ACCEPT或者DROP
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * 获取来源Ip或Ip段，例如192.168.0.0/16
     * @return CidrIp 来源Ip或Ip段，例如192.168.0.0/16
     */
    public String getCidrIp() {
        return this.CidrIp;
    }

    /**
     * 设置来源Ip或Ip段，例如192.168.0.0/16
     * @param CidrIp 来源Ip或Ip段，例如192.168.0.0/16
     */
    public void setCidrIp(String CidrIp) {
        this.CidrIp = CidrIp;
    }

    /**
     * 获取端口
     * @return PortRange 端口
     */
    public String getPortRange() {
        return this.PortRange;
    }

    /**
     * 设置端口
     * @param PortRange 端口
     */
    public void setPortRange(String PortRange) {
        this.PortRange = PortRange;
    }

    /**
     * 获取网络协议，支持udp、tcp等
     * @return IpProtocol 网络协议，支持udp、tcp等
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * 设置网络协议，支持udp、tcp等
     * @param IpProtocol 网络协议，支持udp、tcp等
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * 获取规则限定的方向，进站规则为INPUT
     * @return Dir 规则限定的方向，进站规则为INPUT
     */
    public String getDir() {
        return this.Dir;
    }

    /**
     * 设置规则限定的方向，进站规则为INPUT
     * @param Dir 规则限定的方向，进站规则为INPUT
     */
    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "CidrIp", this.CidrIp);
        this.setParamSimple(map, prefix + "PortRange", this.PortRange);
        this.setParamSimple(map, prefix + "IpProtocol", this.IpProtocol);
        this.setParamSimple(map, prefix + "Dir", this.Dir);

    }
}

