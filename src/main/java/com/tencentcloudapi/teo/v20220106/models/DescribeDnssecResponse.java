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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDnssecResponse extends AbstractModel{

    /**
    * 站点 ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 站点名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * DNSSEC 状态
- enabled 开启
- disabled 关闭
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * DNSSEC 相关信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Dnssec")
    @Expose
    private DnssecInfo Dnssec;

    /**
    * 修改时间
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 站点 ID 
     * @return Id 站点 ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 站点 ID
     * @param Id 站点 ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 站点名称 
     * @return Name 站点名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 站点名称
     * @param Name 站点名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get DNSSEC 状态
- enabled 开启
- disabled 关闭 
     * @return Status DNSSEC 状态
- enabled 开启
- disabled 关闭
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set DNSSEC 状态
- enabled 开启
- disabled 关闭
     * @param Status DNSSEC 状态
- enabled 开启
- disabled 关闭
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get DNSSEC 相关信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Dnssec DNSSEC 相关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DnssecInfo getDnssec() {
        return this.Dnssec;
    }

    /**
     * Set DNSSEC 相关信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Dnssec DNSSEC 相关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDnssec(DnssecInfo Dnssec) {
        this.Dnssec = Dnssec;
    }

    /**
     * Get 修改时间 
     * @return ModifiedOn 修改时间
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set 修改时间
     * @param ModifiedOn 修改时间
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDnssecResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDnssecResponse(DescribeDnssecResponse source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Dnssec != null) {
            this.Dnssec = new DnssecInfo(source.Dnssec);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Dnssec.", this.Dnssec);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

