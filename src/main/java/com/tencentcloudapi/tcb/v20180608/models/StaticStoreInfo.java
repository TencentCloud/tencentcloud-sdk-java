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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaticStoreInfo extends AbstractModel {

    /**
    * 环境ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 静态域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdnDomain")
    @Expose
    private String CdnDomain;

    /**
    * COS桶
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * cos区域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Regoin")
    @Expose
    private String Regoin;

    /**
    * 资源状态:init(初始化)/process(处理中)/online(上线)/destroying(销毁中)/offline(下线))
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 环境ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvId 环境ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvId 环境ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 静态域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdnDomain 静态域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCdnDomain() {
        return this.CdnDomain;
    }

    /**
     * Set 静态域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdnDomain 静态域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdnDomain(String CdnDomain) {
        this.CdnDomain = CdnDomain;
    }

    /**
     * Get COS桶
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bucket COS桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS桶
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bucket COS桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get cos区域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Regoin cos区域
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getRegoin() {
        return this.Regoin;
    }

    /**
     * Set cos区域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Regoin cos区域
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setRegoin(String Regoin) {
        this.Regoin = Regoin;
    }

    /**
     * Get 资源状态:init(初始化)/process(处理中)/online(上线)/destroying(销毁中)/offline(下线))
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 资源状态:init(初始化)/process(处理中)/online(上线)/destroying(销毁中)/offline(下线))
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 资源状态:init(初始化)/process(处理中)/online(上线)/destroying(销毁中)/offline(下线))
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 资源状态:init(初始化)/process(处理中)/online(上线)/destroying(销毁中)/offline(下线))
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public StaticStoreInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaticStoreInfo(StaticStoreInfo source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.CdnDomain != null) {
            this.CdnDomain = new String(source.CdnDomain);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Regoin != null) {
            this.Regoin = new String(source.Regoin);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "CdnDomain", this.CdnDomain);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Regoin", this.Regoin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

