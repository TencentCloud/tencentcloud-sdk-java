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

public class UsageSummary extends AbstractModel {

    /**
    * <p>MODEL 域专属</p>
    */
    @SerializedName("Model")
    @Expose
    private ModelUsageSummary Model;

    /**
    * <p>PLATFORM 域专属</p>
    */
    @SerializedName("Platform")
    @Expose
    private PlatformUsageSummary Platform;

    /**
    * <p>PLUGIN 域专属</p>
    */
    @SerializedName("Plugin")
    @Expose
    private PluginUsageSummary Plugin;

    /**
    * <p>来源 ID；CORP 视图=space_id（企业视图按 space 分组），SPACE 视图=app_id（uint64 字符串），APP 视图=app_id</p>
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * <p>来源名称；CORP 视图=space_name，SPACE 视图=app_name，APP 视图=app_name</p>
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * <p>视图类型，决定 SourceId/SourceName 的业务含义</p><table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>VIEW_TYPE_UNSPECIFIED</td><td>0</td><td>未指定（无效值，请求勿传）</td></tr><tr><td>VIEW_TYPE_CORP</td><td>1</td><td>企业视图</td></tr><tr><td>VIEW_TYPE_SPACE</td><td>2</td><td>空间视图</td></tr><tr><td>VIEW_TYPE_APP</td><td>3</td><td>应用视图</td></tr></tbody></table>
    */
    @SerializedName("ViewType")
    @Expose
    private Long ViewType;

    /**
     * Get <p>MODEL 域专属</p> 
     * @return Model <p>MODEL 域专属</p>
     */
    public ModelUsageSummary getModel() {
        return this.Model;
    }

    /**
     * Set <p>MODEL 域专属</p>
     * @param Model <p>MODEL 域专属</p>
     */
    public void setModel(ModelUsageSummary Model) {
        this.Model = Model;
    }

    /**
     * Get <p>PLATFORM 域专属</p> 
     * @return Platform <p>PLATFORM 域专属</p>
     */
    public PlatformUsageSummary getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>PLATFORM 域专属</p>
     * @param Platform <p>PLATFORM 域专属</p>
     */
    public void setPlatform(PlatformUsageSummary Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>PLUGIN 域专属</p> 
     * @return Plugin <p>PLUGIN 域专属</p>
     */
    public PluginUsageSummary getPlugin() {
        return this.Plugin;
    }

    /**
     * Set <p>PLUGIN 域专属</p>
     * @param Plugin <p>PLUGIN 域专属</p>
     */
    public void setPlugin(PluginUsageSummary Plugin) {
        this.Plugin = Plugin;
    }

    /**
     * Get <p>来源 ID；CORP 视图=space_id（企业视图按 space 分组），SPACE 视图=app_id（uint64 字符串），APP 视图=app_id</p> 
     * @return SourceId <p>来源 ID；CORP 视图=space_id（企业视图按 space 分组），SPACE 视图=app_id（uint64 字符串），APP 视图=app_id</p>
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set <p>来源 ID；CORP 视图=space_id（企业视图按 space 分组），SPACE 视图=app_id（uint64 字符串），APP 视图=app_id</p>
     * @param SourceId <p>来源 ID；CORP 视图=space_id（企业视图按 space 分组），SPACE 视图=app_id（uint64 字符串），APP 视图=app_id</p>
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get <p>来源名称；CORP 视图=space_name，SPACE 视图=app_name，APP 视图=app_name</p> 
     * @return SourceName <p>来源名称；CORP 视图=space_name，SPACE 视图=app_name，APP 视图=app_name</p>
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set <p>来源名称；CORP 视图=space_name，SPACE 视图=app_name，APP 视图=app_name</p>
     * @param SourceName <p>来源名称；CORP 视图=space_name，SPACE 视图=app_name，APP 视图=app_name</p>
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get <p>视图类型，决定 SourceId/SourceName 的业务含义</p><table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>VIEW_TYPE_UNSPECIFIED</td><td>0</td><td>未指定（无效值，请求勿传）</td></tr><tr><td>VIEW_TYPE_CORP</td><td>1</td><td>企业视图</td></tr><tr><td>VIEW_TYPE_SPACE</td><td>2</td><td>空间视图</td></tr><tr><td>VIEW_TYPE_APP</td><td>3</td><td>应用视图</td></tr></tbody></table> 
     * @return ViewType <p>视图类型，决定 SourceId/SourceName 的业务含义</p><table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>VIEW_TYPE_UNSPECIFIED</td><td>0</td><td>未指定（无效值，请求勿传）</td></tr><tr><td>VIEW_TYPE_CORP</td><td>1</td><td>企业视图</td></tr><tr><td>VIEW_TYPE_SPACE</td><td>2</td><td>空间视图</td></tr><tr><td>VIEW_TYPE_APP</td><td>3</td><td>应用视图</td></tr></tbody></table>
     */
    public Long getViewType() {
        return this.ViewType;
    }

    /**
     * Set <p>视图类型，决定 SourceId/SourceName 的业务含义</p><table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>VIEW_TYPE_UNSPECIFIED</td><td>0</td><td>未指定（无效值，请求勿传）</td></tr><tr><td>VIEW_TYPE_CORP</td><td>1</td><td>企业视图</td></tr><tr><td>VIEW_TYPE_SPACE</td><td>2</td><td>空间视图</td></tr><tr><td>VIEW_TYPE_APP</td><td>3</td><td>应用视图</td></tr></tbody></table>
     * @param ViewType <p>视图类型，决定 SourceId/SourceName 的业务含义</p><table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>VIEW_TYPE_UNSPECIFIED</td><td>0</td><td>未指定（无效值，请求勿传）</td></tr><tr><td>VIEW_TYPE_CORP</td><td>1</td><td>企业视图</td></tr><tr><td>VIEW_TYPE_SPACE</td><td>2</td><td>空间视图</td></tr><tr><td>VIEW_TYPE_APP</td><td>3</td><td>应用视图</td></tr></tbody></table>
     */
    public void setViewType(Long ViewType) {
        this.ViewType = ViewType;
    }

    public UsageSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageSummary(UsageSummary source) {
        if (source.Model != null) {
            this.Model = new ModelUsageSummary(source.Model);
        }
        if (source.Platform != null) {
            this.Platform = new PlatformUsageSummary(source.Platform);
        }
        if (source.Plugin != null) {
            this.Plugin = new PluginUsageSummary(source.Plugin);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.ViewType != null) {
            this.ViewType = new Long(source.ViewType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Model.", this.Model);
        this.setParamObj(map, prefix + "Platform.", this.Platform);
        this.setParamObj(map, prefix + "Plugin.", this.Plugin);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "ViewType", this.ViewType);

    }
}

