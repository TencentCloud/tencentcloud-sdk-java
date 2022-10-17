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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunctionTypeOrKind extends AbstractModel{

    /**
    * 无
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 无
    */
    @SerializedName("ZhName")
    @Expose
    private String ZhName;

    /**
    * 无
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
     * Get 无 
     * @return Name 无
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 无
     * @param Name 无
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 无 
     * @return ZhName 无
     */
    public String getZhName() {
        return this.ZhName;
    }

    /**
     * Set 无
     * @param ZhName 无
     */
    public void setZhName(String ZhName) {
        this.ZhName = ZhName;
    }

    /**
     * Get 无 
     * @return EnName 无
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set 无
     * @param EnName 无
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    public FunctionTypeOrKind() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionTypeOrKind(FunctionTypeOrKind source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ZhName != null) {
            this.ZhName = new String(source.ZhName);
        }
        if (source.EnName != null) {
            this.EnName = new String(source.EnName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ZhName", this.ZhName);
        this.setParamSimple(map, prefix + "EnName", this.EnName);

    }
}

