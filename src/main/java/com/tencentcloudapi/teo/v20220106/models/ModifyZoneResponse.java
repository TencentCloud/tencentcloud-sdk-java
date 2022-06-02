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

public class ModifyZoneResponse extends AbstractModel{

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
    * 站点当前使用的 NS
    */
    @SerializedName("OriginalNameServers")
    @Expose
    private String [] OriginalNameServers;

    /**
    * 站点状态
- pending 未接入 NS
- active 已接入 NS
- moved NS 已切走
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 站点接入方式
- full NS 接入
- partial CNAME 接入
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 腾讯云分配的 NS 列表
    */
    @SerializedName("NameServers")
    @Expose
    private String [] NameServers;

    /**
    * 创建时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 修改时间
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * cname 接入状态
- finished 站点验证完成
- pending 站点验证中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CnameStatus")
    @Expose
    private String CnameStatus;

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
     * Get 站点当前使用的 NS 
     * @return OriginalNameServers 站点当前使用的 NS
     */
    public String [] getOriginalNameServers() {
        return this.OriginalNameServers;
    }

    /**
     * Set 站点当前使用的 NS
     * @param OriginalNameServers 站点当前使用的 NS
     */
    public void setOriginalNameServers(String [] OriginalNameServers) {
        this.OriginalNameServers = OriginalNameServers;
    }

    /**
     * Get 站点状态
- pending 未接入 NS
- active 已接入 NS
- moved NS 已切走 
     * @return Status 站点状态
- pending 未接入 NS
- active 已接入 NS
- moved NS 已切走
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 站点状态
- pending 未接入 NS
- active 已接入 NS
- moved NS 已切走
     * @param Status 站点状态
- pending 未接入 NS
- active 已接入 NS
- moved NS 已切走
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 站点接入方式
- full NS 接入
- partial CNAME 接入 
     * @return Type 站点接入方式
- full NS 接入
- partial CNAME 接入
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 站点接入方式
- full NS 接入
- partial CNAME 接入
     * @param Type 站点接入方式
- full NS 接入
- partial CNAME 接入
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 腾讯云分配的 NS 列表 
     * @return NameServers 腾讯云分配的 NS 列表
     */
    public String [] getNameServers() {
        return this.NameServers;
    }

    /**
     * Set 腾讯云分配的 NS 列表
     * @param NameServers 腾讯云分配的 NS 列表
     */
    public void setNameServers(String [] NameServers) {
        this.NameServers = NameServers;
    }

    /**
     * Get 创建时间 
     * @return CreatedOn 创建时间
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 创建时间
     * @param CreatedOn 创建时间
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
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
     * Get cname 接入状态
- finished 站点验证完成
- pending 站点验证中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CnameStatus cname 接入状态
- finished 站点验证完成
- pending 站点验证中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCnameStatus() {
        return this.CnameStatus;
    }

    /**
     * Set cname 接入状态
- finished 站点验证完成
- pending 站点验证中
注意：此字段可能返回 null，表示取不到有效值。
     * @param CnameStatus cname 接入状态
- finished 站点验证完成
- pending 站点验证中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCnameStatus(String CnameStatus) {
        this.CnameStatus = CnameStatus;
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

    public ModifyZoneResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyZoneResponse(ModifyZoneResponse source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OriginalNameServers != null) {
            this.OriginalNameServers = new String[source.OriginalNameServers.length];
            for (int i = 0; i < source.OriginalNameServers.length; i++) {
                this.OriginalNameServers[i] = new String(source.OriginalNameServers[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.NameServers != null) {
            this.NameServers = new String[source.NameServers.length];
            for (int i = 0; i < source.NameServers.length; i++) {
                this.NameServers[i] = new String(source.NameServers[i]);
            }
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.CnameStatus != null) {
            this.CnameStatus = new String(source.CnameStatus);
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
        this.setParamArraySimple(map, prefix + "OriginalNameServers.", this.OriginalNameServers);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "NameServers.", this.NameServers);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "CnameStatus", this.CnameStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

