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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachDisksRequest extends AbstractModel {

    /**
    * EMR集群实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 需要挂载的云盘ID
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * 挂载模式，取值范围：
AUTO_RENEW：自动续费
ALIGN_DEADLINE：自动对其到期时间
    */
    @SerializedName("AlignType")
    @Expose
    private String AlignType;

    /**
    * 需要挂载的cvm节点id列表
    */
    @SerializedName("CvmInstanceIds")
    @Expose
    private String [] CvmInstanceIds;

    /**
    * 是否是新购云盘进行挂载
    */
    @SerializedName("CreateDisk")
    @Expose
    private Boolean CreateDisk;

    /**
    * 新购云盘规格
    */
    @SerializedName("DiskSpec")
    @Expose
    private NodeSpecDiskV2 DiskSpec;

    /**
    * 可选参数，不传该参数则仅执行挂载操作。传入True时，会在挂载成功后将云硬盘设置为随云主机销毁模式，仅对按量计费云硬盘有效。
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * 新挂磁盘时可支持配置的服务名称列表
    */
    @SerializedName("SelectiveConfServices")
    @Expose
    private String [] SelectiveConfServices;

    /**
    * 磁盘计费类型（1包月、3包销）
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * 磁盘包销购买时长（仅支持12、24、36、48、60）
    */
    @SerializedName("UnderWriteDuration")
    @Expose
    private Long UnderWriteDuration;

    /**
     * Get EMR集群实例ID 
     * @return InstanceId EMR集群实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set EMR集群实例ID
     * @param InstanceId EMR集群实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 需要挂载的云盘ID 
     * @return DiskIds 需要挂载的云盘ID
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set 需要挂载的云盘ID
     * @param DiskIds 需要挂载的云盘ID
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get 挂载模式，取值范围：
AUTO_RENEW：自动续费
ALIGN_DEADLINE：自动对其到期时间 
     * @return AlignType 挂载模式，取值范围：
AUTO_RENEW：自动续费
ALIGN_DEADLINE：自动对其到期时间
     */
    public String getAlignType() {
        return this.AlignType;
    }

    /**
     * Set 挂载模式，取值范围：
AUTO_RENEW：自动续费
ALIGN_DEADLINE：自动对其到期时间
     * @param AlignType 挂载模式，取值范围：
AUTO_RENEW：自动续费
ALIGN_DEADLINE：自动对其到期时间
     */
    public void setAlignType(String AlignType) {
        this.AlignType = AlignType;
    }

    /**
     * Get 需要挂载的cvm节点id列表 
     * @return CvmInstanceIds 需要挂载的cvm节点id列表
     */
    public String [] getCvmInstanceIds() {
        return this.CvmInstanceIds;
    }

    /**
     * Set 需要挂载的cvm节点id列表
     * @param CvmInstanceIds 需要挂载的cvm节点id列表
     */
    public void setCvmInstanceIds(String [] CvmInstanceIds) {
        this.CvmInstanceIds = CvmInstanceIds;
    }

    /**
     * Get 是否是新购云盘进行挂载 
     * @return CreateDisk 是否是新购云盘进行挂载
     */
    public Boolean getCreateDisk() {
        return this.CreateDisk;
    }

    /**
     * Set 是否是新购云盘进行挂载
     * @param CreateDisk 是否是新购云盘进行挂载
     */
    public void setCreateDisk(Boolean CreateDisk) {
        this.CreateDisk = CreateDisk;
    }

    /**
     * Get 新购云盘规格 
     * @return DiskSpec 新购云盘规格
     */
    public NodeSpecDiskV2 getDiskSpec() {
        return this.DiskSpec;
    }

    /**
     * Set 新购云盘规格
     * @param DiskSpec 新购云盘规格
     */
    public void setDiskSpec(NodeSpecDiskV2 DiskSpec) {
        this.DiskSpec = DiskSpec;
    }

    /**
     * Get 可选参数，不传该参数则仅执行挂载操作。传入True时，会在挂载成功后将云硬盘设置为随云主机销毁模式，仅对按量计费云硬盘有效。 
     * @return DeleteWithInstance 可选参数，不传该参数则仅执行挂载操作。传入True时，会在挂载成功后将云硬盘设置为随云主机销毁模式，仅对按量计费云硬盘有效。
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set 可选参数，不传该参数则仅执行挂载操作。传入True时，会在挂载成功后将云硬盘设置为随云主机销毁模式，仅对按量计费云硬盘有效。
     * @param DeleteWithInstance 可选参数，不传该参数则仅执行挂载操作。传入True时，会在挂载成功后将云硬盘设置为随云主机销毁模式，仅对按量计费云硬盘有效。
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Get 新挂磁盘时可支持配置的服务名称列表 
     * @return SelectiveConfServices 新挂磁盘时可支持配置的服务名称列表
     */
    public String [] getSelectiveConfServices() {
        return this.SelectiveConfServices;
    }

    /**
     * Set 新挂磁盘时可支持配置的服务名称列表
     * @param SelectiveConfServices 新挂磁盘时可支持配置的服务名称列表
     */
    public void setSelectiveConfServices(String [] SelectiveConfServices) {
        this.SelectiveConfServices = SelectiveConfServices;
    }

    /**
     * Get 磁盘计费类型（1包月、3包销） 
     * @return ChargeType 磁盘计费类型（1包月、3包销）
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 磁盘计费类型（1包月、3包销）
     * @param ChargeType 磁盘计费类型（1包月、3包销）
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 磁盘包销购买时长（仅支持12、24、36、48、60） 
     * @return UnderWriteDuration 磁盘包销购买时长（仅支持12、24、36、48、60）
     */
    public Long getUnderWriteDuration() {
        return this.UnderWriteDuration;
    }

    /**
     * Set 磁盘包销购买时长（仅支持12、24、36、48、60）
     * @param UnderWriteDuration 磁盘包销购买时长（仅支持12、24、36、48、60）
     */
    public void setUnderWriteDuration(Long UnderWriteDuration) {
        this.UnderWriteDuration = UnderWriteDuration;
    }

    public AttachDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachDisksRequest(AttachDisksRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.AlignType != null) {
            this.AlignType = new String(source.AlignType);
        }
        if (source.CvmInstanceIds != null) {
            this.CvmInstanceIds = new String[source.CvmInstanceIds.length];
            for (int i = 0; i < source.CvmInstanceIds.length; i++) {
                this.CvmInstanceIds[i] = new String(source.CvmInstanceIds[i]);
            }
        }
        if (source.CreateDisk != null) {
            this.CreateDisk = new Boolean(source.CreateDisk);
        }
        if (source.DiskSpec != null) {
            this.DiskSpec = new NodeSpecDiskV2(source.DiskSpec);
        }
        if (source.DeleteWithInstance != null) {
            this.DeleteWithInstance = new Boolean(source.DeleteWithInstance);
        }
        if (source.SelectiveConfServices != null) {
            this.SelectiveConfServices = new String[source.SelectiveConfServices.length];
            for (int i = 0; i < source.SelectiveConfServices.length; i++) {
                this.SelectiveConfServices[i] = new String(source.SelectiveConfServices[i]);
            }
        }
        if (source.ChargeType != null) {
            this.ChargeType = new Long(source.ChargeType);
        }
        if (source.UnderWriteDuration != null) {
            this.UnderWriteDuration = new Long(source.UnderWriteDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "AlignType", this.AlignType);
        this.setParamArraySimple(map, prefix + "CvmInstanceIds.", this.CvmInstanceIds);
        this.setParamSimple(map, prefix + "CreateDisk", this.CreateDisk);
        this.setParamObj(map, prefix + "DiskSpec.", this.DiskSpec);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);
        this.setParamArraySimple(map, prefix + "SelectiveConfServices.", this.SelectiveConfServices);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "UnderWriteDuration", this.UnderWriteDuration);

    }
}

