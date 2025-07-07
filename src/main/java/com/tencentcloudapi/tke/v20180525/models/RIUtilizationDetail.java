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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RIUtilizationDetail extends AbstractModel {

    /**
    * 预留券ID
    */
    @SerializedName("ReservedInstanceId")
    @Expose
    private String ReservedInstanceId;

    /**
    * Pod唯一ID
    */
    @SerializedName("EksId")
    @Expose
    private String EksId;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Pod的名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Pod的命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 工作负载类型
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 工作负载名称
    */
    @SerializedName("KindName")
    @Expose
    private String KindName;

    /**
    * Pod的uid
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 用量开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 用量结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 抵扣资源所属产品
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 预留券ID 
     * @return ReservedInstanceId 预留券ID
     */
    public String getReservedInstanceId() {
        return this.ReservedInstanceId;
    }

    /**
     * Set 预留券ID
     * @param ReservedInstanceId 预留券ID
     */
    public void setReservedInstanceId(String ReservedInstanceId) {
        this.ReservedInstanceId = ReservedInstanceId;
    }

    /**
     * Get Pod唯一ID 
     * @return EksId Pod唯一ID
     */
    public String getEksId() {
        return this.EksId;
    }

    /**
     * Set Pod唯一ID
     * @param EksId Pod唯一ID
     */
    public void setEksId(String EksId) {
        this.EksId = EksId;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Pod的名称 
     * @return Name Pod的名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Pod的名称
     * @param Name Pod的名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Pod的命名空间 
     * @return Namespace Pod的命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Pod的命名空间
     * @param Namespace Pod的命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 工作负载类型 
     * @return Kind 工作负载类型
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 工作负载类型
     * @param Kind 工作负载类型
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 工作负载名称 
     * @return KindName 工作负载名称
     */
    public String getKindName() {
        return this.KindName;
    }

    /**
     * Set 工作负载名称
     * @param KindName 工作负载名称
     */
    public void setKindName(String KindName) {
        this.KindName = KindName;
    }

    /**
     * Get Pod的uid 
     * @return Uid Pod的uid
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set Pod的uid
     * @param Uid Pod的uid
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 用量开始时间 
     * @return StartTime 用量开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 用量开始时间
     * @param StartTime 用量开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 用量结束时间 
     * @return EndTime 用量结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 用量结束时间
     * @param EndTime 用量结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 抵扣资源所属产品 
     * @return Product 抵扣资源所属产品
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 抵扣资源所属产品
     * @param Product 抵扣资源所属产品
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public RIUtilizationDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RIUtilizationDetail(RIUtilizationDetail source) {
        if (source.ReservedInstanceId != null) {
            this.ReservedInstanceId = new String(source.ReservedInstanceId);
        }
        if (source.EksId != null) {
            this.EksId = new String(source.EksId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.KindName != null) {
            this.KindName = new String(source.KindName);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReservedInstanceId", this.ReservedInstanceId);
        this.setParamSimple(map, prefix + "EksId", this.EksId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "KindName", this.KindName);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

