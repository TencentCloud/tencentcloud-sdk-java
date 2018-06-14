package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SlaveConfig  extends AbstractModel{


    /**
    * 从库复制方式，可能的返回值：aysnc-异步，semisync-半同步
    */
    @SerializedName("ReplicationMode")
    @Expose
    private String ReplicationMode;

    /**
    * 从库可用区的正式名称，如ap-shanghai-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * 获取从库复制方式，可能的返回值：aysnc-异步，semisync-半同步
     * @return ReplicationMode 从库复制方式，可能的返回值：aysnc-异步，semisync-半同步
     */
    public String getReplicationMode() {
        return this.ReplicationMode;
    }

    /**
     * 设置从库复制方式，可能的返回值：aysnc-异步，semisync-半同步
     * @param ReplicationMode 从库复制方式，可能的返回值：aysnc-异步，semisync-半同步
     */
    public void setReplicationMode(String ReplicationMode) {
        this.ReplicationMode = ReplicationMode;
    }

    /**
     * 获取从库可用区的正式名称，如ap-shanghai-1
     * @return Zone 从库可用区的正式名称，如ap-shanghai-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置从库可用区的正式名称，如ap-shanghai-1
     * @param Zone 从库可用区的正式名称，如ap-shanghai-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicationMode", this.ReplicationMode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

