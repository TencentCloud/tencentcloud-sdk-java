package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class UpgradeDBInstanceRequest  extends AbstractModel{


    /**
    * 实例ID，格式如：cdb-c1nl9rpv或者cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同，可使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;
    

    /**
    * 升级后的内存大小，单位：MB，为保证传入 Memory 值有效，请使用[查询可创建规格（支持可用区、配置自定义）](https://cloud.tencent.com/document/api/253/6109)接口获取可升级的内存规格
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;
    

    /**
    * 升级后的硬盘大小，单位：GB，为保证传入 Volume 值有效，请使用[查询可创建规格（支持可用区、配置自定义）](https://cloud.tencent.com/document/api/253/6109)接口获取可升级的硬盘范围
    */
    @SerializedName("Volume")
    @Expose
    private Integer Volume;
    

    /**
    * 数据复制方式，支持值包括：0-异步复制，1-半同步复制，2-强同步复制，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义
    */
    @SerializedName("ProtectMode")
    @Expose
    private Integer ProtectMode;
    

    /**
    * 部署模式，默认为0，支持值包括：0-单可用区部署，1-多可用区部署，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义
    */
    @SerializedName("DeployMode")
    @Expose
    private Integer DeployMode;
    

    /**
    * 备库1的可用区信息，默认为实例的Zone，升级主实例为多可用区部署时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。可通过<a href='/document/product/236/6921' title='查询云数据库可售卖规格'>查询云数据库可售卖规格</a>查询支持的可用区
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;
    

    /**
    * 主实例数据库引擎版本，支持值包括：5.5、5.6和5.7
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;
    

    /**
    * 切换访问新实例的方式，默认为0，升级主实例时，可指定该参数，升级只读实例或者灾备实例时指定该参数无意义，支持值包括：0-立刻切换，1-时间窗切换；当该值为1时，升级中过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口[切换访问新实例](https://cloud.tencent.com/document/api/403/4392)触发该流程
    */
    @SerializedName("WaitSwitch")
    @Expose
    private Integer WaitSwitch;
    

    /**
    * 备库2的可用区ID，默认为0，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义
    */
    @SerializedName("BackupZone")
    @Expose
    private String BackupZone;
    

    /**
    * 实例类型，默认为 master，支持值包括：master-表示主实例，dr-表示灾备实例，ro-表示只读实例
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;
    

    /**
     * 获取实例ID，格式如：cdb-c1nl9rpv或者cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同，可使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值
     * @return InstanceId 实例ID，格式如：cdb-c1nl9rpv或者cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同，可使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID，格式如：cdb-c1nl9rpv或者cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同，可使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值
     * @param InstanceId 实例ID，格式如：cdb-c1nl9rpv或者cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同，可使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取升级后的内存大小，单位：MB，为保证传入 Memory 值有效，请使用[查询可创建规格（支持可用区、配置自定义）](https://cloud.tencent.com/document/api/253/6109)接口获取可升级的内存规格
     * @return Memory 升级后的内存大小，单位：MB，为保证传入 Memory 值有效，请使用[查询可创建规格（支持可用区、配置自定义）](https://cloud.tencent.com/document/api/253/6109)接口获取可升级的内存规格
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置升级后的内存大小，单位：MB，为保证传入 Memory 值有效，请使用[查询可创建规格（支持可用区、配置自定义）](https://cloud.tencent.com/document/api/253/6109)接口获取可升级的内存规格
     * @param Memory 升级后的内存大小，单位：MB，为保证传入 Memory 值有效，请使用[查询可创建规格（支持可用区、配置自定义）](https://cloud.tencent.com/document/api/253/6109)接口获取可升级的内存规格
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取升级后的硬盘大小，单位：GB，为保证传入 Volume 值有效，请使用[查询可创建规格（支持可用区、配置自定义）](https://cloud.tencent.com/document/api/253/6109)接口获取可升级的硬盘范围
     * @return Volume 升级后的硬盘大小，单位：GB，为保证传入 Volume 值有效，请使用[查询可创建规格（支持可用区、配置自定义）](https://cloud.tencent.com/document/api/253/6109)接口获取可升级的硬盘范围
     */
    public Integer getVolume() {
        return this.Volume;
    }

    /**
     * 设置升级后的硬盘大小，单位：GB，为保证传入 Volume 值有效，请使用[查询可创建规格（支持可用区、配置自定义）](https://cloud.tencent.com/document/api/253/6109)接口获取可升级的硬盘范围
     * @param Volume 升级后的硬盘大小，单位：GB，为保证传入 Volume 值有效，请使用[查询可创建规格（支持可用区、配置自定义）](https://cloud.tencent.com/document/api/253/6109)接口获取可升级的硬盘范围
     */
    public void setVolume(Integer Volume) {
        this.Volume = Volume;
    }

    /**
     * 获取数据复制方式，支持值包括：0-异步复制，1-半同步复制，2-强同步复制，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义
     * @return ProtectMode 数据复制方式，支持值包括：0-异步复制，1-半同步复制，2-强同步复制，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义
     */
    public Integer getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * 设置数据复制方式，支持值包括：0-异步复制，1-半同步复制，2-强同步复制，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义
     * @param ProtectMode 数据复制方式，支持值包括：0-异步复制，1-半同步复制，2-强同步复制，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义
     */
    public void setProtectMode(Integer ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * 获取部署模式，默认为0，支持值包括：0-单可用区部署，1-多可用区部署，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义
     * @return DeployMode 部署模式，默认为0，支持值包括：0-单可用区部署，1-多可用区部署，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义
     */
    public Integer getDeployMode() {
        return this.DeployMode;
    }

    /**
     * 设置部署模式，默认为0，支持值包括：0-单可用区部署，1-多可用区部署，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义
     * @param DeployMode 部署模式，默认为0，支持值包括：0-单可用区部署，1-多可用区部署，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义
     */
    public void setDeployMode(Integer DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * 获取备库1的可用区信息，默认为实例的Zone，升级主实例为多可用区部署时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。可通过<a href='/document/product/236/6921' title='查询云数据库可售卖规格'>查询云数据库可售卖规格</a>查询支持的可用区
     * @return SlaveZone 备库1的可用区信息，默认为实例的Zone，升级主实例为多可用区部署时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。可通过<a href='/document/product/236/6921' title='查询云数据库可售卖规格'>查询云数据库可售卖规格</a>查询支持的可用区
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * 设置备库1的可用区信息，默认为实例的Zone，升级主实例为多可用区部署时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。可通过<a href='/document/product/236/6921' title='查询云数据库可售卖规格'>查询云数据库可售卖规格</a>查询支持的可用区
     * @param SlaveZone 备库1的可用区信息，默认为实例的Zone，升级主实例为多可用区部署时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。可通过<a href='/document/product/236/6921' title='查询云数据库可售卖规格'>查询云数据库可售卖规格</a>查询支持的可用区
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * 获取主实例数据库引擎版本，支持值包括：5.5、5.6和5.7
     * @return EngineVersion 主实例数据库引擎版本，支持值包括：5.5、5.6和5.7
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * 设置主实例数据库引擎版本，支持值包括：5.5、5.6和5.7
     * @param EngineVersion 主实例数据库引擎版本，支持值包括：5.5、5.6和5.7
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * 获取切换访问新实例的方式，默认为0，升级主实例时，可指定该参数，升级只读实例或者灾备实例时指定该参数无意义，支持值包括：0-立刻切换，1-时间窗切换；当该值为1时，升级中过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口[切换访问新实例](https://cloud.tencent.com/document/api/403/4392)触发该流程
     * @return WaitSwitch 切换访问新实例的方式，默认为0，升级主实例时，可指定该参数，升级只读实例或者灾备实例时指定该参数无意义，支持值包括：0-立刻切换，1-时间窗切换；当该值为1时，升级中过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口[切换访问新实例](https://cloud.tencent.com/document/api/403/4392)触发该流程
     */
    public Integer getWaitSwitch() {
        return this.WaitSwitch;
    }

    /**
     * 设置切换访问新实例的方式，默认为0，升级主实例时，可指定该参数，升级只读实例或者灾备实例时指定该参数无意义，支持值包括：0-立刻切换，1-时间窗切换；当该值为1时，升级中过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口[切换访问新实例](https://cloud.tencent.com/document/api/403/4392)触发该流程
     * @param WaitSwitch 切换访问新实例的方式，默认为0，升级主实例时，可指定该参数，升级只读实例或者灾备实例时指定该参数无意义，支持值包括：0-立刻切换，1-时间窗切换；当该值为1时，升级中过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口[切换访问新实例](https://cloud.tencent.com/document/api/403/4392)触发该流程
     */
    public void setWaitSwitch(Integer WaitSwitch) {
        this.WaitSwitch = WaitSwitch;
    }

    /**
     * 获取备库2的可用区ID，默认为0，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义
     * @return BackupZone 备库2的可用区ID，默认为0，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义
     */
    public String getBackupZone() {
        return this.BackupZone;
    }

    /**
     * 设置备库2的可用区ID，默认为0，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义
     * @param BackupZone 备库2的可用区ID，默认为0，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义
     */
    public void setBackupZone(String BackupZone) {
        this.BackupZone = BackupZone;
    }

    /**
     * 获取实例类型，默认为 master，支持值包括：master-表示主实例，dr-表示灾备实例，ro-表示只读实例
     * @return InstanceRole 实例类型，默认为 master，支持值包括：master-表示主实例，dr-表示灾备实例，ro-表示只读实例
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * 设置实例类型，默认为 master，支持值包括：master-表示主实例，dr-表示灾备实例，ro-表示只读实例
     * @param InstanceRole 实例类型，默认为 master，支持值包括：master-表示主实例，dr-表示灾备实例，ro-表示只读实例
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "WaitSwitch", this.WaitSwitch);
        this.setParamSimple(map, prefix + "BackupZone", this.BackupZone);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);

    }
}

