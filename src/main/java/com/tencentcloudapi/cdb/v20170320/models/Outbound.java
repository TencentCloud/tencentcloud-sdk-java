package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Outbound  extends AbstractModel{


    /**
    * 策略，ACCEPT或者DROP
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 目的Ip或Ip段，例如172.16.0.0/12
    */
    @SerializedName("CidrIp")
    @Expose
    private String CidrIp;

    /**
    * 端口或者端口范围
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
    * 规则限定的方向，进站规则为OUTPUT
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
     * 获取目的Ip或Ip段，例如172.16.0.0/12
     * @return CidrIp 目的Ip或Ip段，例如172.16.0.0/12
     */
    public String getCidrIp() {
        return this.CidrIp;
    }

    /**
     * 设置目的Ip或Ip段，例如172.16.0.0/12
     * @param CidrIp 目的Ip或Ip段，例如172.16.0.0/12
     */
    public void setCidrIp(String CidrIp) {
        this.CidrIp = CidrIp;
    }

    /**
     * 获取端口或者端口范围
     * @return PortRange 端口或者端口范围
     */
    public String getPortRange() {
        return this.PortRange;
    }

    /**
     * 设置端口或者端口范围
     * @param PortRange 端口或者端口范围
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
     * 获取规则限定的方向，进站规则为OUTPUT
     * @return Dir 规则限定的方向，进站规则为OUTPUT
     */
    public String getDir() {
        return this.Dir;
    }

    /**
     * 设置规则限定的方向，进站规则为OUTPUT
     * @param Dir 规则限定的方向，进站规则为OUTPUT
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

