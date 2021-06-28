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
    * 运行时id
    */
    @SerializedName("RuntimeId")
    @Expose
    private Long RuntimeId;

    /**
    * 运行时名称，用户输入，同一uin内唯一
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 运行时类型：0: sandbox, 1:shared, 2:private
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 运行时所在地域，tianjin，beijiing，guangzhou等
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 运行时所在地域，tianjin，beijiing，guangzhou等（同Zone）
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 运行时应用listener地址后缀
    */
    @SerializedName("Addr")
    @Expose
    private String Addr;

    /**
     * Get 运行时id 
     * @return RuntimeId 运行时id
     */
    public Long getRuntimeId() {
        return this.RuntimeId;
    }

    /**
     * Set 运行时id
     * @param RuntimeId 运行时id
     */
    public void setRuntimeId(Long RuntimeId) {
        this.RuntimeId = RuntimeId;
    }

    /**
     * Get 运行时名称，用户输入，同一uin内唯一 
     * @return DisplayName 运行时名称，用户输入，同一uin内唯一
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 运行时名称，用户输入，同一uin内唯一
     * @param DisplayName 运行时名称，用户输入，同一uin内唯一
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 运行时类型：0: sandbox, 1:shared, 2:private 
     * @return Type 运行时类型：0: sandbox, 1:shared, 2:private
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 运行时类型：0: sandbox, 1:shared, 2:private
     * @param Type 运行时类型：0: sandbox, 1:shared, 2:private
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 运行时所在地域，tianjin，beijiing，guangzhou等 
     * @return Zone 运行时所在地域，tianjin，beijiing，guangzhou等
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 运行时所在地域，tianjin，beijiing，guangzhou等
     * @param Zone 运行时所在地域，tianjin，beijiing，guangzhou等
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 运行时所在地域，tianjin，beijiing，guangzhou等（同Zone） 
     * @return Area 运行时所在地域，tianjin，beijiing，guangzhou等（同Zone）
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 运行时所在地域，tianjin，beijiing，guangzhou等（同Zone）
     * @param Area 运行时所在地域，tianjin，beijiing，guangzhou等（同Zone）
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 运行时应用listener地址后缀 
     * @return Addr 运行时应用listener地址后缀
     */
    public String getAddr() {
        return this.Addr;
    }

    /**
     * Set 运行时应用listener地址后缀
     * @param Addr 运行时应用listener地址后缀
     */
    public void setAddr(String Addr) {
        this.Addr = Addr;
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

    }
}

