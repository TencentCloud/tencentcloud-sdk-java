package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifyDBInstanceVipVportRequest  extends AbstractModel{


    /**
    * 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同，可使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 目标IP。该参数和DstPort参数，两者必传一个。
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * 目标端口，支持范围为：[1024-65535]。该参数和DstIp参数，两者必传一个。
    */
    @SerializedName("DstPort")
    @Expose
    private Integer DstPort;

    /**
    * 私有网络统一ID。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 子网统一ID。
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
     * 获取实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同，可使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
     * @return InstanceId 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同，可使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同，可使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
     * @param InstanceId 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同，可使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取目标IP。该参数和DstPort参数，两者必传一个。
     * @return DstIp 目标IP。该参数和DstPort参数，两者必传一个。
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * 设置目标IP。该参数和DstPort参数，两者必传一个。
     * @param DstIp 目标IP。该参数和DstPort参数，两者必传一个。
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * 获取目标端口，支持范围为：[1024-65535]。该参数和DstIp参数，两者必传一个。
     * @return DstPort 目标端口，支持范围为：[1024-65535]。该参数和DstIp参数，两者必传一个。
     */
    public Integer getDstPort() {
        return this.DstPort;
    }

    /**
     * 设置目标端口，支持范围为：[1024-65535]。该参数和DstIp参数，两者必传一个。
     * @param DstPort 目标端口，支持范围为：[1024-65535]。该参数和DstIp参数，两者必传一个。
     */
    public void setDstPort(Integer DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * 获取私有网络统一ID。
     * @return UniqVpcId 私有网络统一ID。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * 设置私有网络统一ID。
     * @param UniqVpcId 私有网络统一ID。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * 获取子网统一ID。
     * @return UniqSubnetId 子网统一ID。
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * 设置子网统一ID。
     * @param UniqSubnetId 子网统一ID。
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);

    }
}

