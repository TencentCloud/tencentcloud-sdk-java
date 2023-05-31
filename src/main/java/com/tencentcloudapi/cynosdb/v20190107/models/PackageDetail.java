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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PackageDetail extends AbstractModel{

    /**
    * AppId账户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 资源包唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 成功抵扣容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessDeductSpec")
    @Expose
    private Float SuccessDeductSpec;

    /**
    * 截止当前，资源包已使用的容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageTotalUsedSpec")
    @Expose
    private Float PackageTotalUsedSpec;

    /**
    * 抵扣开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 抵扣结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtendInfo")
    @Expose
    private String ExtendInfo;

    /**
     * Get AppId账户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId AppId账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set AppId账户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId AppId账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 资源包唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageId 资源包唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 资源包唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageId 资源包唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 成功抵扣容量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessDeductSpec 成功抵扣容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getSuccessDeductSpec() {
        return this.SuccessDeductSpec;
    }

    /**
     * Set 成功抵扣容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessDeductSpec 成功抵扣容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessDeductSpec(Float SuccessDeductSpec) {
        this.SuccessDeductSpec = SuccessDeductSpec;
    }

    /**
     * Get 截止当前，资源包已使用的容量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageTotalUsedSpec 截止当前，资源包已使用的容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getPackageTotalUsedSpec() {
        return this.PackageTotalUsedSpec;
    }

    /**
     * Set 截止当前，资源包已使用的容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageTotalUsedSpec 截止当前，资源包已使用的容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageTotalUsedSpec(Float PackageTotalUsedSpec) {
        this.PackageTotalUsedSpec = PackageTotalUsedSpec;
    }

    /**
     * Get 抵扣开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 抵扣开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 抵扣开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 抵扣开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 抵扣结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 抵扣结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 抵扣结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 抵扣结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 扩展信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtendInfo 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtendInfo() {
        return this.ExtendInfo;
    }

    /**
     * Set 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtendInfo 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtendInfo(String ExtendInfo) {
        this.ExtendInfo = ExtendInfo;
    }

    public PackageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PackageDetail(PackageDetail source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SuccessDeductSpec != null) {
            this.SuccessDeductSpec = new Float(source.SuccessDeductSpec);
        }
        if (source.PackageTotalUsedSpec != null) {
            this.PackageTotalUsedSpec = new Float(source.PackageTotalUsedSpec);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ExtendInfo != null) {
            this.ExtendInfo = new String(source.ExtendInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SuccessDeductSpec", this.SuccessDeductSpec);
        this.setParamSimple(map, prefix + "PackageTotalUsedSpec", this.PackageTotalUsedSpec);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExtendInfo", this.ExtendInfo);

    }
}

