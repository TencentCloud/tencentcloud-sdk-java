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

public class DescribePluginRequest extends AbstractModel {

    /**
    * <p>插件id</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <p>当前空间id</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>获取指定字段</p>
    */
    @SerializedName("FieldMask")
    @Expose
    private FieldMask FieldMask;

    /**
    * <p>插件展示场景。不传或取 0 时不限定场景。</p><p>枚举值：</p><ul><li>0：不限定场景</li><li>1：Agent 模式</li><li>2：工作流</li><li>3：智能工作台</li></ul>
    */
    @SerializedName("Module")
    @Expose
    private Long Module;

    /**
     * Get <p>插件id</p> 
     * @return PluginId <p>插件id</p>
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set <p>插件id</p>
     * @param PluginId <p>插件id</p>
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get <p>当前空间id</p> 
     * @return SpaceId <p>当前空间id</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>当前空间id</p>
     * @param SpaceId <p>当前空间id</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>获取指定字段</p> 
     * @return FieldMask <p>获取指定字段</p>
     */
    public FieldMask getFieldMask() {
        return this.FieldMask;
    }

    /**
     * Set <p>获取指定字段</p>
     * @param FieldMask <p>获取指定字段</p>
     */
    public void setFieldMask(FieldMask FieldMask) {
        this.FieldMask = FieldMask;
    }

    /**
     * Get <p>插件展示场景。不传或取 0 时不限定场景。</p><p>枚举值：</p><ul><li>0：不限定场景</li><li>1：Agent 模式</li><li>2：工作流</li><li>3：智能工作台</li></ul> 
     * @return Module <p>插件展示场景。不传或取 0 时不限定场景。</p><p>枚举值：</p><ul><li>0：不限定场景</li><li>1：Agent 模式</li><li>2：工作流</li><li>3：智能工作台</li></ul>
     */
    public Long getModule() {
        return this.Module;
    }

    /**
     * Set <p>插件展示场景。不传或取 0 时不限定场景。</p><p>枚举值：</p><ul><li>0：不限定场景</li><li>1：Agent 模式</li><li>2：工作流</li><li>3：智能工作台</li></ul>
     * @param Module <p>插件展示场景。不传或取 0 时不限定场景。</p><p>枚举值：</p><ul><li>0：不限定场景</li><li>1：Agent 模式</li><li>2：工作流</li><li>3：智能工作台</li></ul>
     */
    public void setModule(Long Module) {
        this.Module = Module;
    }

    public DescribePluginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePluginRequest(DescribePluginRequest source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.FieldMask != null) {
            this.FieldMask = new FieldMask(source.FieldMask);
        }
        if (source.Module != null) {
            this.Module = new Long(source.Module);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamObj(map, prefix + "FieldMask.", this.FieldMask);
        this.setParamSimple(map, prefix + "Module", this.Module);

    }
}

