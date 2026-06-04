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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentToolOutputParameter extends AbstractModel {

    /**
    * <p>参数名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>变量描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>参数类型</p><p>枚举值：</p><ul><li>0： STRING</li><li>1： INT</li><li>2： FLOAT</li><li>3： BOOL</li><li>4： OBJECT</li><li>5： ARRAY_STRING</li><li>6： ARRAY_INT</li><li>7： ARRAY_FLOAT</li><li>8： ARRAY_BOOL</li><li>9： ARRAY_OBJECT</li><li>20： ARRAY_ARRAY</li><li>99： NULL</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>子参数，仅 OBJECT 或 ARRAY_OBJECT 类型时使用</p>
    */
    @SerializedName("SubParameterList")
    @Expose
    private AgentToolOutputParameter [] SubParameterList;

    /**
    * <p>解析方式</p>
    */
    @SerializedName("RenderMode")
    @Expose
    private Long RenderMode;

    /**
     * Get <p>参数名称</p> 
     * @return Name <p>参数名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>参数名称</p>
     * @param Name <p>参数名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>变量描述</p> 
     * @return Description <p>变量描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>变量描述</p>
     * @param Description <p>变量描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>参数类型</p><p>枚举值：</p><ul><li>0： STRING</li><li>1： INT</li><li>2： FLOAT</li><li>3： BOOL</li><li>4： OBJECT</li><li>5： ARRAY_STRING</li><li>6： ARRAY_INT</li><li>7： ARRAY_FLOAT</li><li>8： ARRAY_BOOL</li><li>9： ARRAY_OBJECT</li><li>20： ARRAY_ARRAY</li><li>99： NULL</li></ul> 
     * @return Type <p>参数类型</p><p>枚举值：</p><ul><li>0： STRING</li><li>1： INT</li><li>2： FLOAT</li><li>3： BOOL</li><li>4： OBJECT</li><li>5： ARRAY_STRING</li><li>6： ARRAY_INT</li><li>7： ARRAY_FLOAT</li><li>8： ARRAY_BOOL</li><li>9： ARRAY_OBJECT</li><li>20： ARRAY_ARRAY</li><li>99： NULL</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>参数类型</p><p>枚举值：</p><ul><li>0： STRING</li><li>1： INT</li><li>2： FLOAT</li><li>3： BOOL</li><li>4： OBJECT</li><li>5： ARRAY_STRING</li><li>6： ARRAY_INT</li><li>7： ARRAY_FLOAT</li><li>8： ARRAY_BOOL</li><li>9： ARRAY_OBJECT</li><li>20： ARRAY_ARRAY</li><li>99： NULL</li></ul>
     * @param Type <p>参数类型</p><p>枚举值：</p><ul><li>0： STRING</li><li>1： INT</li><li>2： FLOAT</li><li>3： BOOL</li><li>4： OBJECT</li><li>5： ARRAY_STRING</li><li>6： ARRAY_INT</li><li>7： ARRAY_FLOAT</li><li>8： ARRAY_BOOL</li><li>9： ARRAY_OBJECT</li><li>20： ARRAY_ARRAY</li><li>99： NULL</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>子参数，仅 OBJECT 或 ARRAY_OBJECT 类型时使用</p> 
     * @return SubParameterList <p>子参数，仅 OBJECT 或 ARRAY_OBJECT 类型时使用</p>
     */
    public AgentToolOutputParameter [] getSubParameterList() {
        return this.SubParameterList;
    }

    /**
     * Set <p>子参数，仅 OBJECT 或 ARRAY_OBJECT 类型时使用</p>
     * @param SubParameterList <p>子参数，仅 OBJECT 或 ARRAY_OBJECT 类型时使用</p>
     */
    public void setSubParameterList(AgentToolOutputParameter [] SubParameterList) {
        this.SubParameterList = SubParameterList;
    }

    /**
     * Get <p>解析方式</p> 
     * @return RenderMode <p>解析方式</p>
     */
    public Long getRenderMode() {
        return this.RenderMode;
    }

    /**
     * Set <p>解析方式</p>
     * @param RenderMode <p>解析方式</p>
     */
    public void setRenderMode(Long RenderMode) {
        this.RenderMode = RenderMode;
    }

    public AgentToolOutputParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentToolOutputParameter(AgentToolOutputParameter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SubParameterList != null) {
            this.SubParameterList = new AgentToolOutputParameter[source.SubParameterList.length];
            for (int i = 0; i < source.SubParameterList.length; i++) {
                this.SubParameterList[i] = new AgentToolOutputParameter(source.SubParameterList[i]);
            }
        }
        if (source.RenderMode != null) {
            this.RenderMode = new Long(source.RenderMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "SubParameterList.", this.SubParameterList);
        this.setParamSimple(map, prefix + "RenderMode", this.RenderMode);

    }
}

