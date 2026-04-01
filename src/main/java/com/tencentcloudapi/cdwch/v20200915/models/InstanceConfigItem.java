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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceConfigItem extends AbstractModel {

    /**
    * <p>key</p>
    */
    @SerializedName("ConfKey")
    @Expose
    private String ConfKey;

    /**
    * <p>value</p>
    */
    @SerializedName("ConfValue")
    @Expose
    private String ConfValue;

    /**
    * <p>add/delete/update</p>
    */
    @SerializedName("ModifyType")
    @Expose
    private String ModifyType;

    /**
    * <p>是否需要重启</p>
    */
    @SerializedName("NeedRestart")
    @Expose
    private Boolean NeedRestart;

    /**
    * <p>修改前的值</p>
    */
    @SerializedName("OriginalConfValue")
    @Expose
    private String OriginalConfValue;

    /**
     * Get <p>key</p> 
     * @return ConfKey <p>key</p>
     */
    public String getConfKey() {
        return this.ConfKey;
    }

    /**
     * Set <p>key</p>
     * @param ConfKey <p>key</p>
     */
    public void setConfKey(String ConfKey) {
        this.ConfKey = ConfKey;
    }

    /**
     * Get <p>value</p> 
     * @return ConfValue <p>value</p>
     */
    public String getConfValue() {
        return this.ConfValue;
    }

    /**
     * Set <p>value</p>
     * @param ConfValue <p>value</p>
     */
    public void setConfValue(String ConfValue) {
        this.ConfValue = ConfValue;
    }

    /**
     * Get <p>add/delete/update</p> 
     * @return ModifyType <p>add/delete/update</p>
     */
    public String getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set <p>add/delete/update</p>
     * @param ModifyType <p>add/delete/update</p>
     */
    public void setModifyType(String ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get <p>是否需要重启</p> 
     * @return NeedRestart <p>是否需要重启</p>
     */
    public Boolean getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set <p>是否需要重启</p>
     * @param NeedRestart <p>是否需要重启</p>
     */
    public void setNeedRestart(Boolean NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get <p>修改前的值</p> 
     * @return OriginalConfValue <p>修改前的值</p>
     */
    public String getOriginalConfValue() {
        return this.OriginalConfValue;
    }

    /**
     * Set <p>修改前的值</p>
     * @param OriginalConfValue <p>修改前的值</p>
     */
    public void setOriginalConfValue(String OriginalConfValue) {
        this.OriginalConfValue = OriginalConfValue;
    }

    public InstanceConfigItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceConfigItem(InstanceConfigItem source) {
        if (source.ConfKey != null) {
            this.ConfKey = new String(source.ConfKey);
        }
        if (source.ConfValue != null) {
            this.ConfValue = new String(source.ConfValue);
        }
        if (source.ModifyType != null) {
            this.ModifyType = new String(source.ModifyType);
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new Boolean(source.NeedRestart);
        }
        if (source.OriginalConfValue != null) {
            this.OriginalConfValue = new String(source.OriginalConfValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfKey", this.ConfKey);
        this.setParamSimple(map, prefix + "ConfValue", this.ConfValue);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamSimple(map, prefix + "OriginalConfValue", this.OriginalConfValue);

    }
}

