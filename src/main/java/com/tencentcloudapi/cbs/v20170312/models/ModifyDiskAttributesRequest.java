/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDiskAttributesRequest extends AbstractModel {

    /**
    * 一个或多个待操作的云硬盘ID，可以通过[DescribeDisks](/document/product/362/16315)接口查询。如果传入多个云盘ID，仅支持将所有云盘修改为同一属性。

    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * 新的云硬盘名称。
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
    * 是否为弹性云盘，FALSE表示非弹性云盘，TRUE表示弹性云盘。仅支持非弹性云盘修改为弹性云盘。
    */
    @SerializedName("Portable")
    @Expose
    private Boolean Portable;

    /**
    * 新的云硬盘项目ID，只支持修改弹性云盘的项目ID。通过[DescribeProject](/document/api/378/4400)接口查询可用项目及其ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 成功挂载到云主机后该云硬盘是否随云主机销毁，TRUE表示随云主机销毁，FALSE表示不随云主机销毁。仅支持按量计费云硬盘数据盘。
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * 变更云盘类型时，可传入该参数，表示变更的目标类型，取值范围：<br><li>CLOUD_PREMIUM：表示高性能云硬盘</li><li>CLOUD_SSD：表示SSD云硬盘。</li>当前不支持批量变更类型，即传入DiskType时，DiskIds仅支持传入一块云盘；<br>变更云盘类型时不支持同时变更其他属性。
具体说明请参考[调整云硬盘类型](https://cloud.tencent.com/document/product/362/32540)
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 开启/关闭云盘性能突发功能，取值范围： 
CREATE：开启
CANCEL：关闭
    */
    @SerializedName("BurstPerformanceOperation")
    @Expose
    private String BurstPerformanceOperation;

    /**
     * Get 一个或多个待操作的云硬盘ID，可以通过[DescribeDisks](/document/product/362/16315)接口查询。如果传入多个云盘ID，仅支持将所有云盘修改为同一属性。
 
     * @return DiskIds 一个或多个待操作的云硬盘ID，可以通过[DescribeDisks](/document/product/362/16315)接口查询。如果传入多个云盘ID，仅支持将所有云盘修改为同一属性。

     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set 一个或多个待操作的云硬盘ID，可以通过[DescribeDisks](/document/product/362/16315)接口查询。如果传入多个云盘ID，仅支持将所有云盘修改为同一属性。

     * @param DiskIds 一个或多个待操作的云硬盘ID，可以通过[DescribeDisks](/document/product/362/16315)接口查询。如果传入多个云盘ID，仅支持将所有云盘修改为同一属性。

     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get 新的云硬盘名称。 
     * @return DiskName 新的云硬盘名称。
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set 新的云硬盘名称。
     * @param DiskName 新的云硬盘名称。
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    /**
     * Get 是否为弹性云盘，FALSE表示非弹性云盘，TRUE表示弹性云盘。仅支持非弹性云盘修改为弹性云盘。 
     * @return Portable 是否为弹性云盘，FALSE表示非弹性云盘，TRUE表示弹性云盘。仅支持非弹性云盘修改为弹性云盘。
     */
    public Boolean getPortable() {
        return this.Portable;
    }

    /**
     * Set 是否为弹性云盘，FALSE表示非弹性云盘，TRUE表示弹性云盘。仅支持非弹性云盘修改为弹性云盘。
     * @param Portable 是否为弹性云盘，FALSE表示非弹性云盘，TRUE表示弹性云盘。仅支持非弹性云盘修改为弹性云盘。
     */
    public void setPortable(Boolean Portable) {
        this.Portable = Portable;
    }

    /**
     * Get 新的云硬盘项目ID，只支持修改弹性云盘的项目ID。通过[DescribeProject](/document/api/378/4400)接口查询可用项目及其ID。 
     * @return ProjectId 新的云硬盘项目ID，只支持修改弹性云盘的项目ID。通过[DescribeProject](/document/api/378/4400)接口查询可用项目及其ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 新的云硬盘项目ID，只支持修改弹性云盘的项目ID。通过[DescribeProject](/document/api/378/4400)接口查询可用项目及其ID。
     * @param ProjectId 新的云硬盘项目ID，只支持修改弹性云盘的项目ID。通过[DescribeProject](/document/api/378/4400)接口查询可用项目及其ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 成功挂载到云主机后该云硬盘是否随云主机销毁，TRUE表示随云主机销毁，FALSE表示不随云主机销毁。仅支持按量计费云硬盘数据盘。 
     * @return DeleteWithInstance 成功挂载到云主机后该云硬盘是否随云主机销毁，TRUE表示随云主机销毁，FALSE表示不随云主机销毁。仅支持按量计费云硬盘数据盘。
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set 成功挂载到云主机后该云硬盘是否随云主机销毁，TRUE表示随云主机销毁，FALSE表示不随云主机销毁。仅支持按量计费云硬盘数据盘。
     * @param DeleteWithInstance 成功挂载到云主机后该云硬盘是否随云主机销毁，TRUE表示随云主机销毁，FALSE表示不随云主机销毁。仅支持按量计费云硬盘数据盘。
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Get 变更云盘类型时，可传入该参数，表示变更的目标类型，取值范围：<br><li>CLOUD_PREMIUM：表示高性能云硬盘</li><li>CLOUD_SSD：表示SSD云硬盘。</li>当前不支持批量变更类型，即传入DiskType时，DiskIds仅支持传入一块云盘；<br>变更云盘类型时不支持同时变更其他属性。
具体说明请参考[调整云硬盘类型](https://cloud.tencent.com/document/product/362/32540) 
     * @return DiskType 变更云盘类型时，可传入该参数，表示变更的目标类型，取值范围：<br><li>CLOUD_PREMIUM：表示高性能云硬盘</li><li>CLOUD_SSD：表示SSD云硬盘。</li>当前不支持批量变更类型，即传入DiskType时，DiskIds仅支持传入一块云盘；<br>变更云盘类型时不支持同时变更其他属性。
具体说明请参考[调整云硬盘类型](https://cloud.tencent.com/document/product/362/32540)
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 变更云盘类型时，可传入该参数，表示变更的目标类型，取值范围：<br><li>CLOUD_PREMIUM：表示高性能云硬盘</li><li>CLOUD_SSD：表示SSD云硬盘。</li>当前不支持批量变更类型，即传入DiskType时，DiskIds仅支持传入一块云盘；<br>变更云盘类型时不支持同时变更其他属性。
具体说明请参考[调整云硬盘类型](https://cloud.tencent.com/document/product/362/32540)
     * @param DiskType 变更云盘类型时，可传入该参数，表示变更的目标类型，取值范围：<br><li>CLOUD_PREMIUM：表示高性能云硬盘</li><li>CLOUD_SSD：表示SSD云硬盘。</li>当前不支持批量变更类型，即传入DiskType时，DiskIds仅支持传入一块云盘；<br>变更云盘类型时不支持同时变更其他属性。
具体说明请参考[调整云硬盘类型](https://cloud.tencent.com/document/product/362/32540)
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 开启/关闭云盘性能突发功能，取值范围： 
CREATE：开启
CANCEL：关闭 
     * @return BurstPerformanceOperation 开启/关闭云盘性能突发功能，取值范围： 
CREATE：开启
CANCEL：关闭
     */
    public String getBurstPerformanceOperation() {
        return this.BurstPerformanceOperation;
    }

    /**
     * Set 开启/关闭云盘性能突发功能，取值范围： 
CREATE：开启
CANCEL：关闭
     * @param BurstPerformanceOperation 开启/关闭云盘性能突发功能，取值范围： 
CREATE：开启
CANCEL：关闭
     */
    public void setBurstPerformanceOperation(String BurstPerformanceOperation) {
        this.BurstPerformanceOperation = BurstPerformanceOperation;
    }

    public ModifyDiskAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDiskAttributesRequest(ModifyDiskAttributesRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.DiskName != null) {
            this.DiskName = new String(source.DiskName);
        }
        if (source.Portable != null) {
            this.Portable = new Boolean(source.Portable);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.DeleteWithInstance != null) {
            this.DeleteWithInstance = new Boolean(source.DeleteWithInstance);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.BurstPerformanceOperation != null) {
            this.BurstPerformanceOperation = new String(source.BurstPerformanceOperation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamSimple(map, prefix + "Portable", this.Portable);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "BurstPerformanceOperation", this.BurstPerformanceOperation);

    }
}

