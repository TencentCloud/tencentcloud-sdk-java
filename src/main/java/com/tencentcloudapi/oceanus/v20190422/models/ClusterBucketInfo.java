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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterBucketInfo extends AbstractModel {

    /**
    * <p>桶唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerialId")
    @Expose
    private String SerialId;

    /**
    * <p>集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * <p>桶名字</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>桶类型</p><p>枚举值：</p><ul><li>0： 普通桶</li><li>1： 加速桶</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BucketType")
    @Expose
    private Long BucketType;

    /**
    * <p>鉴权类型</p><p>枚举值：</p><ul><li>0： 不鉴权</li><li>1： 鉴权</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthMode")
    @Expose
    private Long AuthMode;

    /**
    * <p>是否默认属性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * <p>桶状态</p><p>枚举值：</p><ul><li>1： 正常</li><li>0： 禁用</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>作业数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobCount")
    @Expose
    private Long JobCount;

    /**
    * <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>创建时间</p><p>参数格式：yyyy-MM-dd HH:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p><p>参数格式：yyyy-MM-dd HH:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>桶唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerialId <p>桶唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSerialId() {
        return this.SerialId;
    }

    /**
     * Set <p>桶唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerialId <p>桶唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerialId(String SerialId) {
        this.SerialId = SerialId;
    }

    /**
     * Get <p>集群id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId <p>集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId <p>集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>桶名字</p> 
     * @return Bucket <p>桶名字</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>桶名字</p>
     * @param Bucket <p>桶名字</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>桶类型</p><p>枚举值：</p><ul><li>0： 普通桶</li><li>1： 加速桶</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BucketType <p>桶类型</p><p>枚举值：</p><ul><li>0： 普通桶</li><li>1： 加速桶</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBucketType() {
        return this.BucketType;
    }

    /**
     * Set <p>桶类型</p><p>枚举值：</p><ul><li>0： 普通桶</li><li>1： 加速桶</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BucketType <p>桶类型</p><p>枚举值：</p><ul><li>0： 普通桶</li><li>1： 加速桶</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucketType(Long BucketType) {
        this.BucketType = BucketType;
    }

    /**
     * Get <p>鉴权类型</p><p>枚举值：</p><ul><li>0： 不鉴权</li><li>1： 鉴权</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthMode <p>鉴权类型</p><p>枚举值：</p><ul><li>0： 不鉴权</li><li>1： 鉴权</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuthMode() {
        return this.AuthMode;
    }

    /**
     * Set <p>鉴权类型</p><p>枚举值：</p><ul><li>0： 不鉴权</li><li>1： 鉴权</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthMode <p>鉴权类型</p><p>枚举值：</p><ul><li>0： 不鉴权</li><li>1： 鉴权</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthMode(Long AuthMode) {
        this.AuthMode = AuthMode;
    }

    /**
     * Get <p>是否默认属性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDefault <p>是否默认属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>是否默认属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDefault <p>是否默认属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>桶状态</p><p>枚举值：</p><ul><li>1： 正常</li><li>0： 禁用</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>桶状态</p><p>枚举值：</p><ul><li>1： 正常</li><li>0： 禁用</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>桶状态</p><p>枚举值：</p><ul><li>1： 正常</li><li>0： 禁用</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>桶状态</p><p>枚举值：</p><ul><li>1： 正常</li><li>0： 禁用</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>作业数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobCount <p>作业数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJobCount() {
        return this.JobCount;
    }

    /**
     * Set <p>作业数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobCount <p>作业数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobCount(Long JobCount) {
        this.JobCount = JobCount;
    }

    /**
     * Get <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>创建时间</p><p>参数格式：yyyy-MM-dd HH:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p><p>参数格式：yyyy-MM-dd HH:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p><p>参数格式：yyyy-MM-dd HH:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p><p>参数格式：yyyy-MM-dd HH:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p><p>参数格式：yyyy-MM-dd HH:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间</p><p>参数格式：yyyy-MM-dd HH:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p><p>参数格式：yyyy-MM-dd HH:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间</p><p>参数格式：yyyy-MM-dd HH:mm:ss</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ClusterBucketInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterBucketInfo(ClusterBucketInfo source) {
        if (source.SerialId != null) {
            this.SerialId = new String(source.SerialId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new Long(source.ClusterId);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.BucketType != null) {
            this.BucketType = new Long(source.BucketType);
        }
        if (source.AuthMode != null) {
            this.AuthMode = new Long(source.AuthMode);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.JobCount != null) {
            this.JobCount = new Long(source.JobCount);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SerialId", this.SerialId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "BucketType", this.BucketType);
        this.setParamSimple(map, prefix + "AuthMode", this.AuthMode);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "JobCount", this.JobCount);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

