/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeDBInstanceRequest extends AbstractModel {

    /**
    * <p>实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同，可使用 <a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口获取，其值为输出参数中字段 InstanceId 的值。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>升级后的内存大小，单位：MB，为保证传入 Memory 值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可升级的内存规格。<br>说明：如果进行迁移业务，请一定填写实例规格（CPU、内存），不然系统会默认以最小允许规格传参。</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>升级后的硬盘大小，单位：GB，为保证传入 Volume 值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可升级的硬盘范围。</p>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * <p>数据复制方式，支持值包括：0 - 异步复制，1 - 半同步复制，2 - 强同步复制，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。</p>
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * <p>部署模式，默认为 0，支持值包括：0 - 单可用区部署，1 - 多可用区部署，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。</p>
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * <p>备库1的可用区信息，默认和实例的 Zone 参数一致，升级主实例为多可用区部署时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。可通过 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口查询支持的可用区。</p>
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * <p>主实例数据库引擎版本，支持值包括：5.5、5.6、5.7、8.0。<br>说明：升级数据库版本请使用 <a href="https://cloud.tencent.com/document/api/236/15870">UpgradeDBInstanceEngineVersion</a> 接口。</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * <p>切换访问新实例的方式，默认为 0。支持值包括：0 - 立刻切换，1 - 时间窗切换；当该值为 1 时，升级过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口 <a href="https://cloud.tencent.com/document/product/236/15864">切换访问新实例</a> 触发该流程。</p>
    */
    @SerializedName("WaitSwitch")
    @Expose
    private Long WaitSwitch;

    /**
    * <p>备库2的可用区信息，默认为空，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。可通过 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口查询支持的可用区。<br>备注：如您要将三节点降级至双节点，将该参数设置为空值即可实现。</p>
    */
    @SerializedName("BackupZone")
    @Expose
    private String BackupZone;

    /**
    * <p>实例类型，默认为 master，支持值包括：master - 表示主实例，dr - 表示灾备实例，ro - 表示只读实例。</p>
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * <p>实例隔离类型。支持值包括： &quot;UNIVERSAL&quot; - 通用型实例， &quot;EXCLUSIVE&quot; - 独享型实例， &quot;BASIC&quot; - 基础版实例。</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>升级后的实例cpu核数，如果不传将根据 Memory 指定的内存值自动填充最小允许规格的cpu值。<br>说明：如果进行迁移业务，请一定填写实例规格（CPU、内存），不然系统会默认以最小允许规格传参。</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>是否极速变配。0-普通升级，1-极速变配，2 极速优先。选择极速变配会根据资源状况校验是否可以进行极速变配，满足条件则进行极速变配，不满足条件会返回报错信息。</p>
    */
    @SerializedName("FastUpgrade")
    @Expose
    private Long FastUpgrade;

    /**
    * <p>延迟阈值。取值范围1~10，默认值为10。</p>
    */
    @SerializedName("MaxDelayTime")
    @Expose
    private Long MaxDelayTime;

    /**
    * <p>是否跨区迁移。0-普通迁移，1-跨区迁移，默认值为0。该值为1时支持变更实例主节点可用区。</p>
    */
    @SerializedName("CrossCluster")
    @Expose
    private Long CrossCluster;

    /**
    * <p>主节点可用区，该值仅在跨区迁移时生效。仅支持同地域下的可用区进行迁移。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>针对跨集群搬迁场景，选择同可用区RO的处理逻辑。together-同可用区RO跟随主实例迁移至目标可用区（默认选项），severally-同可用区RO保持原部署模式、不迁移至目标可用区。</p>
    */
    @SerializedName("RoTransType")
    @Expose
    private String RoTransType;

    /**
    * <p>云盘版节点拓扑配置。</p>
    */
    @SerializedName("ClusterTopology")
    @Expose
    private ClusterTopology ClusterTopology;

    /**
    * <p>检查原地升级是否需要重启，1 检查， 0 不检查。如果值为1，检查为原地升级需要重启，则会停止升级并进行返回提示，如果为原地升级不重启，则正常执行升级流程。</p>
    */
    @SerializedName("CheckFastUpgradeReboot")
    @Expose
    private Long CheckFastUpgradeReboot;

    /**
    * <p>数据校验敏感度，非极速变配时使用此参数，敏感度根据当前实例规格计算迁移过程中的数据对比使用的cpu资源<br>对应的选项为: &quot;high&quot;、&quot;normal&quot;、&quot;low&quot;，默认为空<br>参数详解，：<br>&quot;high&quot;: 对应控制台中的高，数据库负载过高不建议使用<br>&quot;normal&quot;：对应控制台中的标准<br>&quot;low&quot;：对应控制台中的低</p>
    */
    @SerializedName("DataCheckSensitive")
    @Expose
    private String DataCheckSensitive;

    /**
     * Get <p>实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同，可使用 <a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口获取，其值为输出参数中字段 InstanceId 的值。</p> 
     * @return InstanceId <p>实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同，可使用 <a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口获取，其值为输出参数中字段 InstanceId 的值。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同，可使用 <a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口获取，其值为输出参数中字段 InstanceId 的值。</p>
     * @param InstanceId <p>实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同，可使用 <a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口获取，其值为输出参数中字段 InstanceId 的值。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>升级后的内存大小，单位：MB，为保证传入 Memory 值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可升级的内存规格。<br>说明：如果进行迁移业务，请一定填写实例规格（CPU、内存），不然系统会默认以最小允许规格传参。</p> 
     * @return Memory <p>升级后的内存大小，单位：MB，为保证传入 Memory 值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可升级的内存规格。<br>说明：如果进行迁移业务，请一定填写实例规格（CPU、内存），不然系统会默认以最小允许规格传参。</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>升级后的内存大小，单位：MB，为保证传入 Memory 值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可升级的内存规格。<br>说明：如果进行迁移业务，请一定填写实例规格（CPU、内存），不然系统会默认以最小允许规格传参。</p>
     * @param Memory <p>升级后的内存大小，单位：MB，为保证传入 Memory 值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可升级的内存规格。<br>说明：如果进行迁移业务，请一定填写实例规格（CPU、内存），不然系统会默认以最小允许规格传参。</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>升级后的硬盘大小，单位：GB，为保证传入 Volume 值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可升级的硬盘范围。</p> 
     * @return Volume <p>升级后的硬盘大小，单位：GB，为保证传入 Volume 值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可升级的硬盘范围。</p>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>升级后的硬盘大小，单位：GB，为保证传入 Volume 值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可升级的硬盘范围。</p>
     * @param Volume <p>升级后的硬盘大小，单位：GB，为保证传入 Volume 值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可升级的硬盘范围。</p>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>数据复制方式，支持值包括：0 - 异步复制，1 - 半同步复制，2 - 强同步复制，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。</p> 
     * @return ProtectMode <p>数据复制方式，支持值包括：0 - 异步复制，1 - 半同步复制，2 - 强同步复制，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。</p>
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set <p>数据复制方式，支持值包括：0 - 异步复制，1 - 半同步复制，2 - 强同步复制，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。</p>
     * @param ProtectMode <p>数据复制方式，支持值包括：0 - 异步复制，1 - 半同步复制，2 - 强同步复制，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。</p>
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get <p>部署模式，默认为 0，支持值包括：0 - 单可用区部署，1 - 多可用区部署，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。</p> 
     * @return DeployMode <p>部署模式，默认为 0，支持值包括：0 - 单可用区部署，1 - 多可用区部署，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。</p>
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set <p>部署模式，默认为 0，支持值包括：0 - 单可用区部署，1 - 多可用区部署，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。</p>
     * @param DeployMode <p>部署模式，默认为 0，支持值包括：0 - 单可用区部署，1 - 多可用区部署，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。</p>
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get <p>备库1的可用区信息，默认和实例的 Zone 参数一致，升级主实例为多可用区部署时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。可通过 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口查询支持的可用区。</p> 
     * @return SlaveZone <p>备库1的可用区信息，默认和实例的 Zone 参数一致，升级主实例为多可用区部署时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。可通过 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口查询支持的可用区。</p>
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set <p>备库1的可用区信息，默认和实例的 Zone 参数一致，升级主实例为多可用区部署时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。可通过 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口查询支持的可用区。</p>
     * @param SlaveZone <p>备库1的可用区信息，默认和实例的 Zone 参数一致，升级主实例为多可用区部署时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。可通过 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口查询支持的可用区。</p>
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get <p>主实例数据库引擎版本，支持值包括：5.5、5.6、5.7、8.0。<br>说明：升级数据库版本请使用 <a href="https://cloud.tencent.com/document/api/236/15870">UpgradeDBInstanceEngineVersion</a> 接口。</p> 
     * @return EngineVersion <p>主实例数据库引擎版本，支持值包括：5.5、5.6、5.7、8.0。<br>说明：升级数据库版本请使用 <a href="https://cloud.tencent.com/document/api/236/15870">UpgradeDBInstanceEngineVersion</a> 接口。</p>
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>主实例数据库引擎版本，支持值包括：5.5、5.6、5.7、8.0。<br>说明：升级数据库版本请使用 <a href="https://cloud.tencent.com/document/api/236/15870">UpgradeDBInstanceEngineVersion</a> 接口。</p>
     * @param EngineVersion <p>主实例数据库引擎版本，支持值包括：5.5、5.6、5.7、8.0。<br>说明：升级数据库版本请使用 <a href="https://cloud.tencent.com/document/api/236/15870">UpgradeDBInstanceEngineVersion</a> 接口。</p>
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>切换访问新实例的方式，默认为 0。支持值包括：0 - 立刻切换，1 - 时间窗切换；当该值为 1 时，升级过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口 <a href="https://cloud.tencent.com/document/product/236/15864">切换访问新实例</a> 触发该流程。</p> 
     * @return WaitSwitch <p>切换访问新实例的方式，默认为 0。支持值包括：0 - 立刻切换，1 - 时间窗切换；当该值为 1 时，升级过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口 <a href="https://cloud.tencent.com/document/product/236/15864">切换访问新实例</a> 触发该流程。</p>
     */
    public Long getWaitSwitch() {
        return this.WaitSwitch;
    }

    /**
     * Set <p>切换访问新实例的方式，默认为 0。支持值包括：0 - 立刻切换，1 - 时间窗切换；当该值为 1 时，升级过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口 <a href="https://cloud.tencent.com/document/product/236/15864">切换访问新实例</a> 触发该流程。</p>
     * @param WaitSwitch <p>切换访问新实例的方式，默认为 0。支持值包括：0 - 立刻切换，1 - 时间窗切换；当该值为 1 时，升级过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口 <a href="https://cloud.tencent.com/document/product/236/15864">切换访问新实例</a> 触发该流程。</p>
     */
    public void setWaitSwitch(Long WaitSwitch) {
        this.WaitSwitch = WaitSwitch;
    }

    /**
     * Get <p>备库2的可用区信息，默认为空，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。可通过 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口查询支持的可用区。<br>备注：如您要将三节点降级至双节点，将该参数设置为空值即可实现。</p> 
     * @return BackupZone <p>备库2的可用区信息，默认为空，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。可通过 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口查询支持的可用区。<br>备注：如您要将三节点降级至双节点，将该参数设置为空值即可实现。</p>
     */
    public String getBackupZone() {
        return this.BackupZone;
    }

    /**
     * Set <p>备库2的可用区信息，默认为空，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。可通过 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口查询支持的可用区。<br>备注：如您要将三节点降级至双节点，将该参数设置为空值即可实现。</p>
     * @param BackupZone <p>备库2的可用区信息，默认为空，升级主实例时可指定该参数，升级只读实例或者灾备实例时指定该参数无意义。可通过 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口查询支持的可用区。<br>备注：如您要将三节点降级至双节点，将该参数设置为空值即可实现。</p>
     */
    public void setBackupZone(String BackupZone) {
        this.BackupZone = BackupZone;
    }

    /**
     * Get <p>实例类型，默认为 master，支持值包括：master - 表示主实例，dr - 表示灾备实例，ro - 表示只读实例。</p> 
     * @return InstanceRole <p>实例类型，默认为 master，支持值包括：master - 表示主实例，dr - 表示灾备实例，ro - 表示只读实例。</p>
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set <p>实例类型，默认为 master，支持值包括：master - 表示主实例，dr - 表示灾备实例，ro - 表示只读实例。</p>
     * @param InstanceRole <p>实例类型，默认为 master，支持值包括：master - 表示主实例，dr - 表示灾备实例，ro - 表示只读实例。</p>
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get <p>实例隔离类型。支持值包括： &quot;UNIVERSAL&quot; - 通用型实例， &quot;EXCLUSIVE&quot; - 独享型实例， &quot;BASIC&quot; - 基础版实例。</p> 
     * @return DeviceType <p>实例隔离类型。支持值包括： &quot;UNIVERSAL&quot; - 通用型实例， &quot;EXCLUSIVE&quot; - 独享型实例， &quot;BASIC&quot; - 基础版实例。</p>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>实例隔离类型。支持值包括： &quot;UNIVERSAL&quot; - 通用型实例， &quot;EXCLUSIVE&quot; - 独享型实例， &quot;BASIC&quot; - 基础版实例。</p>
     * @param DeviceType <p>实例隔离类型。支持值包括： &quot;UNIVERSAL&quot; - 通用型实例， &quot;EXCLUSIVE&quot; - 独享型实例， &quot;BASIC&quot; - 基础版实例。</p>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>升级后的实例cpu核数，如果不传将根据 Memory 指定的内存值自动填充最小允许规格的cpu值。<br>说明：如果进行迁移业务，请一定填写实例规格（CPU、内存），不然系统会默认以最小允许规格传参。</p> 
     * @return Cpu <p>升级后的实例cpu核数，如果不传将根据 Memory 指定的内存值自动填充最小允许规格的cpu值。<br>说明：如果进行迁移业务，请一定填写实例规格（CPU、内存），不然系统会默认以最小允许规格传参。</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>升级后的实例cpu核数，如果不传将根据 Memory 指定的内存值自动填充最小允许规格的cpu值。<br>说明：如果进行迁移业务，请一定填写实例规格（CPU、内存），不然系统会默认以最小允许规格传参。</p>
     * @param Cpu <p>升级后的实例cpu核数，如果不传将根据 Memory 指定的内存值自动填充最小允许规格的cpu值。<br>说明：如果进行迁移业务，请一定填写实例规格（CPU、内存），不然系统会默认以最小允许规格传参。</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>是否极速变配。0-普通升级，1-极速变配，2 极速优先。选择极速变配会根据资源状况校验是否可以进行极速变配，满足条件则进行极速变配，不满足条件会返回报错信息。</p> 
     * @return FastUpgrade <p>是否极速变配。0-普通升级，1-极速变配，2 极速优先。选择极速变配会根据资源状况校验是否可以进行极速变配，满足条件则进行极速变配，不满足条件会返回报错信息。</p>
     */
    public Long getFastUpgrade() {
        return this.FastUpgrade;
    }

    /**
     * Set <p>是否极速变配。0-普通升级，1-极速变配，2 极速优先。选择极速变配会根据资源状况校验是否可以进行极速变配，满足条件则进行极速变配，不满足条件会返回报错信息。</p>
     * @param FastUpgrade <p>是否极速变配。0-普通升级，1-极速变配，2 极速优先。选择极速变配会根据资源状况校验是否可以进行极速变配，满足条件则进行极速变配，不满足条件会返回报错信息。</p>
     */
    public void setFastUpgrade(Long FastUpgrade) {
        this.FastUpgrade = FastUpgrade;
    }

    /**
     * Get <p>延迟阈值。取值范围1~10，默认值为10。</p> 
     * @return MaxDelayTime <p>延迟阈值。取值范围1~10，默认值为10。</p>
     */
    public Long getMaxDelayTime() {
        return this.MaxDelayTime;
    }

    /**
     * Set <p>延迟阈值。取值范围1~10，默认值为10。</p>
     * @param MaxDelayTime <p>延迟阈值。取值范围1~10，默认值为10。</p>
     */
    public void setMaxDelayTime(Long MaxDelayTime) {
        this.MaxDelayTime = MaxDelayTime;
    }

    /**
     * Get <p>是否跨区迁移。0-普通迁移，1-跨区迁移，默认值为0。该值为1时支持变更实例主节点可用区。</p> 
     * @return CrossCluster <p>是否跨区迁移。0-普通迁移，1-跨区迁移，默认值为0。该值为1时支持变更实例主节点可用区。</p>
     */
    public Long getCrossCluster() {
        return this.CrossCluster;
    }

    /**
     * Set <p>是否跨区迁移。0-普通迁移，1-跨区迁移，默认值为0。该值为1时支持变更实例主节点可用区。</p>
     * @param CrossCluster <p>是否跨区迁移。0-普通迁移，1-跨区迁移，默认值为0。该值为1时支持变更实例主节点可用区。</p>
     */
    public void setCrossCluster(Long CrossCluster) {
        this.CrossCluster = CrossCluster;
    }

    /**
     * Get <p>主节点可用区，该值仅在跨区迁移时生效。仅支持同地域下的可用区进行迁移。</p> 
     * @return ZoneId <p>主节点可用区，该值仅在跨区迁移时生效。仅支持同地域下的可用区进行迁移。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>主节点可用区，该值仅在跨区迁移时生效。仅支持同地域下的可用区进行迁移。</p>
     * @param ZoneId <p>主节点可用区，该值仅在跨区迁移时生效。仅支持同地域下的可用区进行迁移。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>针对跨集群搬迁场景，选择同可用区RO的处理逻辑。together-同可用区RO跟随主实例迁移至目标可用区（默认选项），severally-同可用区RO保持原部署模式、不迁移至目标可用区。</p> 
     * @return RoTransType <p>针对跨集群搬迁场景，选择同可用区RO的处理逻辑。together-同可用区RO跟随主实例迁移至目标可用区（默认选项），severally-同可用区RO保持原部署模式、不迁移至目标可用区。</p>
     */
    public String getRoTransType() {
        return this.RoTransType;
    }

    /**
     * Set <p>针对跨集群搬迁场景，选择同可用区RO的处理逻辑。together-同可用区RO跟随主实例迁移至目标可用区（默认选项），severally-同可用区RO保持原部署模式、不迁移至目标可用区。</p>
     * @param RoTransType <p>针对跨集群搬迁场景，选择同可用区RO的处理逻辑。together-同可用区RO跟随主实例迁移至目标可用区（默认选项），severally-同可用区RO保持原部署模式、不迁移至目标可用区。</p>
     */
    public void setRoTransType(String RoTransType) {
        this.RoTransType = RoTransType;
    }

    /**
     * Get <p>云盘版节点拓扑配置。</p> 
     * @return ClusterTopology <p>云盘版节点拓扑配置。</p>
     */
    public ClusterTopology getClusterTopology() {
        return this.ClusterTopology;
    }

    /**
     * Set <p>云盘版节点拓扑配置。</p>
     * @param ClusterTopology <p>云盘版节点拓扑配置。</p>
     */
    public void setClusterTopology(ClusterTopology ClusterTopology) {
        this.ClusterTopology = ClusterTopology;
    }

    /**
     * Get <p>检查原地升级是否需要重启，1 检查， 0 不检查。如果值为1，检查为原地升级需要重启，则会停止升级并进行返回提示，如果为原地升级不重启，则正常执行升级流程。</p> 
     * @return CheckFastUpgradeReboot <p>检查原地升级是否需要重启，1 检查， 0 不检查。如果值为1，检查为原地升级需要重启，则会停止升级并进行返回提示，如果为原地升级不重启，则正常执行升级流程。</p>
     */
    public Long getCheckFastUpgradeReboot() {
        return this.CheckFastUpgradeReboot;
    }

    /**
     * Set <p>检查原地升级是否需要重启，1 检查， 0 不检查。如果值为1，检查为原地升级需要重启，则会停止升级并进行返回提示，如果为原地升级不重启，则正常执行升级流程。</p>
     * @param CheckFastUpgradeReboot <p>检查原地升级是否需要重启，1 检查， 0 不检查。如果值为1，检查为原地升级需要重启，则会停止升级并进行返回提示，如果为原地升级不重启，则正常执行升级流程。</p>
     */
    public void setCheckFastUpgradeReboot(Long CheckFastUpgradeReboot) {
        this.CheckFastUpgradeReboot = CheckFastUpgradeReboot;
    }

    /**
     * Get <p>数据校验敏感度，非极速变配时使用此参数，敏感度根据当前实例规格计算迁移过程中的数据对比使用的cpu资源<br>对应的选项为: &quot;high&quot;、&quot;normal&quot;、&quot;low&quot;，默认为空<br>参数详解，：<br>&quot;high&quot;: 对应控制台中的高，数据库负载过高不建议使用<br>&quot;normal&quot;：对应控制台中的标准<br>&quot;low&quot;：对应控制台中的低</p> 
     * @return DataCheckSensitive <p>数据校验敏感度，非极速变配时使用此参数，敏感度根据当前实例规格计算迁移过程中的数据对比使用的cpu资源<br>对应的选项为: &quot;high&quot;、&quot;normal&quot;、&quot;low&quot;，默认为空<br>参数详解，：<br>&quot;high&quot;: 对应控制台中的高，数据库负载过高不建议使用<br>&quot;normal&quot;：对应控制台中的标准<br>&quot;low&quot;：对应控制台中的低</p>
     */
    public String getDataCheckSensitive() {
        return this.DataCheckSensitive;
    }

    /**
     * Set <p>数据校验敏感度，非极速变配时使用此参数，敏感度根据当前实例规格计算迁移过程中的数据对比使用的cpu资源<br>对应的选项为: &quot;high&quot;、&quot;normal&quot;、&quot;low&quot;，默认为空<br>参数详解，：<br>&quot;high&quot;: 对应控制台中的高，数据库负载过高不建议使用<br>&quot;normal&quot;：对应控制台中的标准<br>&quot;low&quot;：对应控制台中的低</p>
     * @param DataCheckSensitive <p>数据校验敏感度，非极速变配时使用此参数，敏感度根据当前实例规格计算迁移过程中的数据对比使用的cpu资源<br>对应的选项为: &quot;high&quot;、&quot;normal&quot;、&quot;low&quot;，默认为空<br>参数详解，：<br>&quot;high&quot;: 对应控制台中的高，数据库负载过高不建议使用<br>&quot;normal&quot;：对应控制台中的标准<br>&quot;low&quot;：对应控制台中的低</p>
     */
    public void setDataCheckSensitive(String DataCheckSensitive) {
        this.DataCheckSensitive = DataCheckSensitive;
    }

    public UpgradeDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDBInstanceRequest(UpgradeDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.ProtectMode != null) {
            this.ProtectMode = new Long(source.ProtectMode);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new Long(source.DeployMode);
        }
        if (source.SlaveZone != null) {
            this.SlaveZone = new String(source.SlaveZone);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.WaitSwitch != null) {
            this.WaitSwitch = new Long(source.WaitSwitch);
        }
        if (source.BackupZone != null) {
            this.BackupZone = new String(source.BackupZone);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.FastUpgrade != null) {
            this.FastUpgrade = new Long(source.FastUpgrade);
        }
        if (source.MaxDelayTime != null) {
            this.MaxDelayTime = new Long(source.MaxDelayTime);
        }
        if (source.CrossCluster != null) {
            this.CrossCluster = new Long(source.CrossCluster);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RoTransType != null) {
            this.RoTransType = new String(source.RoTransType);
        }
        if (source.ClusterTopology != null) {
            this.ClusterTopology = new ClusterTopology(source.ClusterTopology);
        }
        if (source.CheckFastUpgradeReboot != null) {
            this.CheckFastUpgradeReboot = new Long(source.CheckFastUpgradeReboot);
        }
        if (source.DataCheckSensitive != null) {
            this.DataCheckSensitive = new String(source.DataCheckSensitive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "FastUpgrade", this.FastUpgrade);
        this.setParamSimple(map, prefix + "MaxDelayTime", this.MaxDelayTime);
        this.setParamSimple(map, prefix + "CrossCluster", this.CrossCluster);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RoTransType", this.RoTransType);
        this.setParamObj(map, prefix + "ClusterTopology.", this.ClusterTopology);
        this.setParamSimple(map, prefix + "CheckFastUpgradeReboot", this.CheckFastUpgradeReboot);
        this.setParamSimple(map, prefix + "DataCheckSensitive", this.DataCheckSensitive);

    }
}

