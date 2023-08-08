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
package com.tencentcloudapi.eis.v20210601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbstractRuntimeMC extends AbstractModel{

    /**
    * 环境id
    */
    @SerializedName("RuntimeId")
    @Expose
    private Long RuntimeId;

    /**
    * 环境名称，用户输入，同一uin内唯一
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 环境类型：0: sandbox, 1:shared, 2:private
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 环境所在地域，tianjin，beijiing，guangzhou等
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 环境所在地域，tianjin，beijiing，guangzhou等（同Zone）
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 环境应用listener地址后缀
    */
    @SerializedName("Addr")
    @Expose
    private String Addr;

    /**
    * 环境状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 环境过期时间
    */
    @SerializedName("ExpiredAt")
    @Expose
    private Long ExpiredAt;

    /**
    * 环境运行类型：0:运行时类型、1:api类型
    */
    @SerializedName("RuntimeClass")
    @Expose
    private Long RuntimeClass;

    /**
    * 是否已在当前环境发布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Deployed")
    @Expose
    private Boolean Deployed;

    /**
    * 环境扩展组件是否满足应用要求：0=true, 1=false 表示该应用需要扩展组件0(cdc)以及1(java)，但是独立环境有cdc无java，不满足发布要求
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MatchExtensions")
    @Expose
    private String MatchExtensions;

    /**
     * Get 环境id 
     * @return RuntimeId 环境id
     */
    public Long getRuntimeId() {
        return this.RuntimeId;
    }

    /**
     * Set 环境id
     * @param RuntimeId 环境id
     */
    public void setRuntimeId(Long RuntimeId) {
        this.RuntimeId = RuntimeId;
    }

    /**
     * Get 环境名称，用户输入，同一uin内唯一 
     * @return DisplayName 环境名称，用户输入，同一uin内唯一
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 环境名称，用户输入，同一uin内唯一
     * @param DisplayName 环境名称，用户输入，同一uin内唯一
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 环境类型：0: sandbox, 1:shared, 2:private 
     * @return Type 环境类型：0: sandbox, 1:shared, 2:private
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 环境类型：0: sandbox, 1:shared, 2:private
     * @param Type 环境类型：0: sandbox, 1:shared, 2:private
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 环境所在地域，tianjin，beijiing，guangzhou等 
     * @return Zone 环境所在地域，tianjin，beijiing，guangzhou等
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 环境所在地域，tianjin，beijiing，guangzhou等
     * @param Zone 环境所在地域，tianjin，beijiing，guangzhou等
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 环境所在地域，tianjin，beijiing，guangzhou等（同Zone） 
     * @return Area 环境所在地域，tianjin，beijiing，guangzhou等（同Zone）
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 环境所在地域，tianjin，beijiing，guangzhou等（同Zone）
     * @param Area 环境所在地域，tianjin，beijiing，guangzhou等（同Zone）
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 环境应用listener地址后缀 
     * @return Addr 环境应用listener地址后缀
     */
    public String getAddr() {
        return this.Addr;
    }

    /**
     * Set 环境应用listener地址后缀
     * @param Addr 环境应用listener地址后缀
     */
    public void setAddr(String Addr) {
        this.Addr = Addr;
    }

    /**
     * Get 环境状态 
     * @return Status 环境状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 环境状态
     * @param Status 环境状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 环境过期时间 
     * @return ExpiredAt 环境过期时间
     */
    public Long getExpiredAt() {
        return this.ExpiredAt;
    }

    /**
     * Set 环境过期时间
     * @param ExpiredAt 环境过期时间
     */
    public void setExpiredAt(Long ExpiredAt) {
        this.ExpiredAt = ExpiredAt;
    }

    /**
     * Get 环境运行类型：0:运行时类型、1:api类型 
     * @return RuntimeClass 环境运行类型：0:运行时类型、1:api类型
     */
    public Long getRuntimeClass() {
        return this.RuntimeClass;
    }

    /**
     * Set 环境运行类型：0:运行时类型、1:api类型
     * @param RuntimeClass 环境运行类型：0:运行时类型、1:api类型
     */
    public void setRuntimeClass(Long RuntimeClass) {
        this.RuntimeClass = RuntimeClass;
    }

    /**
     * Get 是否已在当前环境发布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Deployed 是否已在当前环境发布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeployed() {
        return this.Deployed;
    }

    /**
     * Set 是否已在当前环境发布
注意：此字段可能返回 null，表示取不到有效值。
     * @param Deployed 是否已在当前环境发布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployed(Boolean Deployed) {
        this.Deployed = Deployed;
    }

    /**
     * Get 环境扩展组件是否满足应用要求：0=true, 1=false 表示该应用需要扩展组件0(cdc)以及1(java)，但是独立环境有cdc无java，不满足发布要求
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MatchExtensions 环境扩展组件是否满足应用要求：0=true, 1=false 表示该应用需要扩展组件0(cdc)以及1(java)，但是独立环境有cdc无java，不满足发布要求
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMatchExtensions() {
        return this.MatchExtensions;
    }

    /**
     * Set 环境扩展组件是否满足应用要求：0=true, 1=false 表示该应用需要扩展组件0(cdc)以及1(java)，但是独立环境有cdc无java，不满足发布要求
注意：此字段可能返回 null，表示取不到有效值。
     * @param MatchExtensions 环境扩展组件是否满足应用要求：0=true, 1=false 表示该应用需要扩展组件0(cdc)以及1(java)，但是独立环境有cdc无java，不满足发布要求
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatchExtensions(String MatchExtensions) {
        this.MatchExtensions = MatchExtensions;
    }

    public AbstractRuntimeMC() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbstractRuntimeMC(AbstractRuntimeMC source) {
        if (source.RuntimeId != null) {
            this.RuntimeId = new Long(source.RuntimeId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Addr != null) {
            this.Addr = new String(source.Addr);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ExpiredAt != null) {
            this.ExpiredAt = new Long(source.ExpiredAt);
        }
        if (source.RuntimeClass != null) {
            this.RuntimeClass = new Long(source.RuntimeClass);
        }
        if (source.Deployed != null) {
            this.Deployed = new Boolean(source.Deployed);
        }
        if (source.MatchExtensions != null) {
            this.MatchExtensions = new String(source.MatchExtensions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuntimeId", this.RuntimeId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Addr", this.Addr);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ExpiredAt", this.ExpiredAt);
        this.setParamSimple(map, prefix + "RuntimeClass", this.RuntimeClass);
        this.setParamSimple(map, prefix + "Deployed", this.Deployed);
        this.setParamSimple(map, prefix + "MatchExtensions", this.MatchExtensions);

    }
}

