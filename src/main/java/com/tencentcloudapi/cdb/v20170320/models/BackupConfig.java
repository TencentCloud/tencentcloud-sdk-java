package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class BackupConfig  extends AbstractModel{


    /**
    * 第二个从库复制方式，可能的返回值：aysnc-异步，semisync-半同步
    */
    @SerializedName("ReplicationMode")
    @Expose
    private String ReplicationMode;

    /**
    * 第二个从库可用区的正式名称，如ap-shanghai-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 第二个从库内网IP地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 第二个从库访问端口
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
     * 获取第二个从库复制方式，可能的返回值：aysnc-异步，semisync-半同步
     * @return ReplicationMode 第二个从库复制方式，可能的返回值：aysnc-异步，semisync-半同步
     */
    public String getReplicationMode() {
        return this.ReplicationMode;
    }

    /**
     * 设置第二个从库复制方式，可能的返回值：aysnc-异步，semisync-半同步
     * @param ReplicationMode 第二个从库复制方式，可能的返回值：aysnc-异步，semisync-半同步
     */
    public void setReplicationMode(String ReplicationMode) {
        this.ReplicationMode = ReplicationMode;
    }

    /**
     * 获取第二个从库可用区的正式名称，如ap-shanghai-1
     * @return Zone 第二个从库可用区的正式名称，如ap-shanghai-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置第二个从库可用区的正式名称，如ap-shanghai-1
     * @param Zone 第二个从库可用区的正式名称，如ap-shanghai-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取第二个从库内网IP地址
     * @return Vip 第二个从库内网IP地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * 设置第二个从库内网IP地址
     * @param Vip 第二个从库内网IP地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * 获取第二个从库访问端口
     * @return Vport 第二个从库访问端口
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * 设置第二个从库访问端口
     * @param Vport 第二个从库访问端口
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicationMode", this.ReplicationMode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

