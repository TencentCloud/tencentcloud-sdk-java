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

public class FunctionTrigger extends AbstractModel {

    /**
    * <p>触发器最后修改时间</p>
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * <p>触发器类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>触发器详细配置</p>
    */
    @SerializedName("TriggerDesc")
    @Expose
    private String TriggerDesc;

    /**
    * <p>触发器名称</p>
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * <p>触发器创建时间</p>
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
     * Get <p>触发器最后修改时间</p> 
     * @return ModTime <p>触发器最后修改时间</p>
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set <p>触发器最后修改时间</p>
     * @param ModTime <p>触发器最后修改时间</p>
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get <p>触发器类型</p> 
     * @return Type <p>触发器类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>触发器类型</p>
     * @param Type <p>触发器类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>触发器详细配置</p> 
     * @return TriggerDesc <p>触发器详细配置</p>
     */
    public String getTriggerDesc() {
        return this.TriggerDesc;
    }

    /**
     * Set <p>触发器详细配置</p>
     * @param TriggerDesc <p>触发器详细配置</p>
     */
    public void setTriggerDesc(String TriggerDesc) {
        this.TriggerDesc = TriggerDesc;
    }

    /**
     * Get <p>触发器名称</p> 
     * @return TriggerName <p>触发器名称</p>
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set <p>触发器名称</p>
     * @param TriggerName <p>触发器名称</p>
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get <p>触发器创建时间</p> 
     * @return AddTime <p>触发器创建时间</p>
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set <p>触发器创建时间</p>
     * @param AddTime <p>触发器创建时间</p>
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    public FunctionTrigger() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionTrigger(FunctionTrigger source) {
        if (source.ModTime != null) {
            this.ModTime = new String(source.ModTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TriggerDesc != null) {
            this.TriggerDesc = new String(source.TriggerDesc);
        }
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TriggerDesc", this.TriggerDesc);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);

    }
}

