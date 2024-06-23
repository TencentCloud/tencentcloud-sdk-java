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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyQACateRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 分类名称

    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分类业务ID
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
     * Get 应用ID 
     * @return BotBizId 应用ID
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID
     * @param BotBizId 应用ID
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 分类名称
 
     * @return Name 分类名称

     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分类名称

     * @param Name 分类名称

     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分类业务ID 
     * @return CateBizId 分类业务ID
     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set 分类业务ID
     * @param CateBizId 分类业务ID
     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
    }

    public ModifyQACateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyQACateRequest(ModifyQACateRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);

    }
}

