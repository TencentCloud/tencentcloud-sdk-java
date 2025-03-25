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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerResp extends AbstractModel {

    /**
    * 触发器名称
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * 触发来源
    */
    @SerializedName("InvokeSource")
    @Expose
    private String InvokeSource;

    /**
    * 触发动作
    */
    @SerializedName("InvokeAction")
    @Expose
    private String InvokeAction;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 触发条件
    */
    @SerializedName("InvokeCondition")
    @Expose
    private TriggerInvokeCondition InvokeCondition;

    /**
    * 触发器参数
    */
    @SerializedName("InvokePara")
    @Expose
    private TriggerInvokePara InvokePara;

    /**
     * Get 触发器名称 
     * @return TriggerName 触发器名称
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set 触发器名称
     * @param TriggerName 触发器名称
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get 触发来源 
     * @return InvokeSource 触发来源
     */
    public String getInvokeSource() {
        return this.InvokeSource;
    }

    /**
     * Set 触发来源
     * @param InvokeSource 触发来源
     */
    public void setInvokeSource(String InvokeSource) {
        this.InvokeSource = InvokeSource;
    }

    /**
     * Get 触发动作 
     * @return InvokeAction 触发动作
     */
    public String getInvokeAction() {
        return this.InvokeAction;
    }

    /**
     * Set 触发动作
     * @param InvokeAction 触发动作
     */
    public void setInvokeAction(String InvokeAction) {
        this.InvokeAction = InvokeAction;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 触发条件 
     * @return InvokeCondition 触发条件
     */
    public TriggerInvokeCondition getInvokeCondition() {
        return this.InvokeCondition;
    }

    /**
     * Set 触发条件
     * @param InvokeCondition 触发条件
     */
    public void setInvokeCondition(TriggerInvokeCondition InvokeCondition) {
        this.InvokeCondition = InvokeCondition;
    }

    /**
     * Get 触发器参数 
     * @return InvokePara 触发器参数
     */
    public TriggerInvokePara getInvokePara() {
        return this.InvokePara;
    }

    /**
     * Set 触发器参数
     * @param InvokePara 触发器参数
     */
    public void setInvokePara(TriggerInvokePara InvokePara) {
        this.InvokePara = InvokePara;
    }

    public TriggerResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerResp(TriggerResp source) {
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.InvokeSource != null) {
            this.InvokeSource = new String(source.InvokeSource);
        }
        if (source.InvokeAction != null) {
            this.InvokeAction = new String(source.InvokeAction);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.InvokeCondition != null) {
            this.InvokeCondition = new TriggerInvokeCondition(source.InvokeCondition);
        }
        if (source.InvokePara != null) {
            this.InvokePara = new TriggerInvokePara(source.InvokePara);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "InvokeSource", this.InvokeSource);
        this.setParamSimple(map, prefix + "InvokeAction", this.InvokeAction);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "InvokeCondition.", this.InvokeCondition);
        this.setParamObj(map, prefix + "InvokePara.", this.InvokePara);

    }
}

