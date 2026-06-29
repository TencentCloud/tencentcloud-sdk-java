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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiPosterSuiteConfig extends AbstractModel {

    /**
    * <p>出图模式</p><p>枚举值：</p><ul><li>auto： 全自动模式。此模式下支持CustomVariables传入。</li><li>modify： 修改模式。此模式下需要在AddOnParameter.ExtPrompt字段提供对应描述。此模式下禁止CustomVariables传入。</li></ul><p>默认值：auto</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>电商平台视觉模板id</p><p>如需个性化定制视觉模板，请提交工单。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>子图配置。</p>
    */
    @SerializedName("Recipe")
    @Expose
    private RecipeItem [] Recipe;

    /**
    * <p>子图文案语言。</p><p>枚举值：</p><ul><li>zh-CN： 简体中文</li><li>en-US： 美式英语</li></ul><p>默认值：zh-CN</p><p>如需支持更多语言输出，请提交工单。</p>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p>子图比例。</p><p>枚举值：</p><ul><li>1:1： 1:1</li><li>3:4： 3:4</li><li>4:3： 4:3</li><li>9:16： 9:16</li><li>16:9： 16:9</li></ul><p>默认值：1:1</p>
    */
    @SerializedName("PanelRatio")
    @Expose
    private String PanelRatio;

    /**
    * <p>子图分辨率</p><p>枚举值：</p><ul><li>720： 720</li><li>1K： 1K</li><li>2K： 2K</li><li>4K： 4K</li></ul><p>默认值：1K</p>
    */
    @SerializedName("PanelResolution")
    @Expose
    private String PanelResolution;

    /**
    * <p>用户自定义变量。</p>
    */
    @SerializedName("CustomVariables")
    @Expose
    private CustomVariable [] CustomVariables;

    /**
    * <p>模型名称。</p><p>枚举值：</p><ul><li>WAND-suite-1.0-flash： WAND-suite-1.0-flash</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
     * Get <p>出图模式</p><p>枚举值：</p><ul><li>auto： 全自动模式。此模式下支持CustomVariables传入。</li><li>modify： 修改模式。此模式下需要在AddOnParameter.ExtPrompt字段提供对应描述。此模式下禁止CustomVariables传入。</li></ul><p>默认值：auto</p> 
     * @return Mode <p>出图模式</p><p>枚举值：</p><ul><li>auto： 全自动模式。此模式下支持CustomVariables传入。</li><li>modify： 修改模式。此模式下需要在AddOnParameter.ExtPrompt字段提供对应描述。此模式下禁止CustomVariables传入。</li></ul><p>默认值：auto</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>出图模式</p><p>枚举值：</p><ul><li>auto： 全自动模式。此模式下支持CustomVariables传入。</li><li>modify： 修改模式。此模式下需要在AddOnParameter.ExtPrompt字段提供对应描述。此模式下禁止CustomVariables传入。</li></ul><p>默认值：auto</p>
     * @param Mode <p>出图模式</p><p>枚举值：</p><ul><li>auto： 全自动模式。此模式下支持CustomVariables传入。</li><li>modify： 修改模式。此模式下需要在AddOnParameter.ExtPrompt字段提供对应描述。此模式下禁止CustomVariables传入。</li></ul><p>默认值：auto</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>电商平台视觉模板id</p><p>如需个性化定制视觉模板，请提交工单。</p> 
     * @return Definition <p>电商平台视觉模板id</p><p>如需个性化定制视觉模板，请提交工单。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>电商平台视觉模板id</p><p>如需个性化定制视觉模板，请提交工单。</p>
     * @param Definition <p>电商平台视觉模板id</p><p>如需个性化定制视觉模板，请提交工单。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>子图配置。</p> 
     * @return Recipe <p>子图配置。</p>
     */
    public RecipeItem [] getRecipe() {
        return this.Recipe;
    }

    /**
     * Set <p>子图配置。</p>
     * @param Recipe <p>子图配置。</p>
     */
    public void setRecipe(RecipeItem [] Recipe) {
        this.Recipe = Recipe;
    }

    /**
     * Get <p>子图文案语言。</p><p>枚举值：</p><ul><li>zh-CN： 简体中文</li><li>en-US： 美式英语</li></ul><p>默认值：zh-CN</p><p>如需支持更多语言输出，请提交工单。</p> 
     * @return Language <p>子图文案语言。</p><p>枚举值：</p><ul><li>zh-CN： 简体中文</li><li>en-US： 美式英语</li></ul><p>默认值：zh-CN</p><p>如需支持更多语言输出，请提交工单。</p>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>子图文案语言。</p><p>枚举值：</p><ul><li>zh-CN： 简体中文</li><li>en-US： 美式英语</li></ul><p>默认值：zh-CN</p><p>如需支持更多语言输出，请提交工单。</p>
     * @param Language <p>子图文案语言。</p><p>枚举值：</p><ul><li>zh-CN： 简体中文</li><li>en-US： 美式英语</li></ul><p>默认值：zh-CN</p><p>如需支持更多语言输出，请提交工单。</p>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p>子图比例。</p><p>枚举值：</p><ul><li>1:1： 1:1</li><li>3:4： 3:4</li><li>4:3： 4:3</li><li>9:16： 9:16</li><li>16:9： 16:9</li></ul><p>默认值：1:1</p> 
     * @return PanelRatio <p>子图比例。</p><p>枚举值：</p><ul><li>1:1： 1:1</li><li>3:4： 3:4</li><li>4:3： 4:3</li><li>9:16： 9:16</li><li>16:9： 16:9</li></ul><p>默认值：1:1</p>
     */
    public String getPanelRatio() {
        return this.PanelRatio;
    }

    /**
     * Set <p>子图比例。</p><p>枚举值：</p><ul><li>1:1： 1:1</li><li>3:4： 3:4</li><li>4:3： 4:3</li><li>9:16： 9:16</li><li>16:9： 16:9</li></ul><p>默认值：1:1</p>
     * @param PanelRatio <p>子图比例。</p><p>枚举值：</p><ul><li>1:1： 1:1</li><li>3:4： 3:4</li><li>4:3： 4:3</li><li>9:16： 9:16</li><li>16:9： 16:9</li></ul><p>默认值：1:1</p>
     */
    public void setPanelRatio(String PanelRatio) {
        this.PanelRatio = PanelRatio;
    }

    /**
     * Get <p>子图分辨率</p><p>枚举值：</p><ul><li>720： 720</li><li>1K： 1K</li><li>2K： 2K</li><li>4K： 4K</li></ul><p>默认值：1K</p> 
     * @return PanelResolution <p>子图分辨率</p><p>枚举值：</p><ul><li>720： 720</li><li>1K： 1K</li><li>2K： 2K</li><li>4K： 4K</li></ul><p>默认值：1K</p>
     */
    public String getPanelResolution() {
        return this.PanelResolution;
    }

    /**
     * Set <p>子图分辨率</p><p>枚举值：</p><ul><li>720： 720</li><li>1K： 1K</li><li>2K： 2K</li><li>4K： 4K</li></ul><p>默认值：1K</p>
     * @param PanelResolution <p>子图分辨率</p><p>枚举值：</p><ul><li>720： 720</li><li>1K： 1K</li><li>2K： 2K</li><li>4K： 4K</li></ul><p>默认值：1K</p>
     */
    public void setPanelResolution(String PanelResolution) {
        this.PanelResolution = PanelResolution;
    }

    /**
     * Get <p>用户自定义变量。</p> 
     * @return CustomVariables <p>用户自定义变量。</p>
     */
    public CustomVariable [] getCustomVariables() {
        return this.CustomVariables;
    }

    /**
     * Set <p>用户自定义变量。</p>
     * @param CustomVariables <p>用户自定义变量。</p>
     */
    public void setCustomVariables(CustomVariable [] CustomVariables) {
        this.CustomVariables = CustomVariables;
    }

    /**
     * Get <p>模型名称。</p><p>枚举值：</p><ul><li>WAND-suite-1.0-flash： WAND-suite-1.0-flash</li></ul> 
     * @return Model <p>模型名称。</p><p>枚举值：</p><ul><li>WAND-suite-1.0-flash： WAND-suite-1.0-flash</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型名称。</p><p>枚举值：</p><ul><li>WAND-suite-1.0-flash： WAND-suite-1.0-flash</li></ul>
     * @param Model <p>模型名称。</p><p>枚举值：</p><ul><li>WAND-suite-1.0-flash： WAND-suite-1.0-flash</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    public AiPosterSuiteConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiPosterSuiteConfig(AiPosterSuiteConfig source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Recipe != null) {
            this.Recipe = new RecipeItem[source.Recipe.length];
            for (int i = 0; i < source.Recipe.length; i++) {
                this.Recipe[i] = new RecipeItem(source.Recipe[i]);
            }
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.PanelRatio != null) {
            this.PanelRatio = new String(source.PanelRatio);
        }
        if (source.PanelResolution != null) {
            this.PanelResolution = new String(source.PanelResolution);
        }
        if (source.CustomVariables != null) {
            this.CustomVariables = new CustomVariable[source.CustomVariables.length];
            for (int i = 0; i < source.CustomVariables.length; i++) {
                this.CustomVariables[i] = new CustomVariable(source.CustomVariables[i]);
            }
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "Recipe.", this.Recipe);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "PanelRatio", this.PanelRatio);
        this.setParamSimple(map, prefix + "PanelResolution", this.PanelResolution);
        this.setParamArrayObj(map, prefix + "CustomVariables.", this.CustomVariables);
        this.setParamSimple(map, prefix + "Model", this.Model);

    }
}

