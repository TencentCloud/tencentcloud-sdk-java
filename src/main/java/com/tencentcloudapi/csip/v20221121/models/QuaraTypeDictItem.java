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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuaraTypeDictItem extends AbstractModel {

    /**
    * <p>告警类型标识，与 QuaraTypes 取值一致</p>
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * <p>展示类型名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>是否推荐隔离</p>
    */
    @SerializedName("Recommend")
    @Expose
    private Boolean Recommend;

    /**
    * <p>描述和建议</p>
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get <p>告警类型标识，与 QuaraTypes 取值一致</p> 
     * @return Code <p>告警类型标识，与 QuaraTypes 取值一致</p>
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set <p>告警类型标识，与 QuaraTypes 取值一致</p>
     * @param Code <p>告警类型标识，与 QuaraTypes 取值一致</p>
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get <p>展示类型名</p> 
     * @return Name <p>展示类型名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>展示类型名</p>
     * @param Name <p>展示类型名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>是否推荐隔离</p> 
     * @return Recommend <p>是否推荐隔离</p>
     */
    public Boolean getRecommend() {
        return this.Recommend;
    }

    /**
     * Set <p>是否推荐隔离</p>
     * @param Recommend <p>是否推荐隔离</p>
     */
    public void setRecommend(Boolean Recommend) {
        this.Recommend = Recommend;
    }

    /**
     * Get <p>描述和建议</p> 
     * @return Desc <p>描述和建议</p>
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set <p>描述和建议</p>
     * @param Desc <p>描述和建议</p>
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public QuaraTypeDictItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuaraTypeDictItem(QuaraTypeDictItem source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Recommend != null) {
            this.Recommend = new Boolean(source.Recommend);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Recommend", this.Recommend);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

