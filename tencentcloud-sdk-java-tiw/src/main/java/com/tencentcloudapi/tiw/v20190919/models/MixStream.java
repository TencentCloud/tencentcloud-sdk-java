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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MixStream extends AbstractModel{

    /**
    * 是否开启混流
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 是否禁用音频混流
    */
    @SerializedName("DisableAudio")
    @Expose
    private Boolean DisableAudio;

    /**
    * 内置混流布局模板ID, 取值 [1, 2], 区别见内置混流布局模板样式示例说明
在没有填Custom字段时候，ModelId是必填的
    */
    @SerializedName("ModelId")
    @Expose
    private Long ModelId;

    /**
    * 老师用户ID
此字段只有在ModelId填了的情况下生效
填写TeacherId的效果是把指定为TeacherId的用户视频流显示在内置模板的第一个小画面中
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * 自定义混流布局参数
当此字段存在时，ModelId 及 TeacherId 字段将被忽略
    */
    @SerializedName("Custom")
    @Expose
    private CustomLayout Custom;

    /**
     * Get 是否开启混流 
     * @return Enabled 是否开启混流
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否开启混流
     * @param Enabled 是否开启混流
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 是否禁用音频混流 
     * @return DisableAudio 是否禁用音频混流
     */
    public Boolean getDisableAudio() {
        return this.DisableAudio;
    }

    /**
     * Set 是否禁用音频混流
     * @param DisableAudio 是否禁用音频混流
     */
    public void setDisableAudio(Boolean DisableAudio) {
        this.DisableAudio = DisableAudio;
    }

    /**
     * Get 内置混流布局模板ID, 取值 [1, 2], 区别见内置混流布局模板样式示例说明
在没有填Custom字段时候，ModelId是必填的 
     * @return ModelId 内置混流布局模板ID, 取值 [1, 2], 区别见内置混流布局模板样式示例说明
在没有填Custom字段时候，ModelId是必填的
     */
    public Long getModelId() {
        return this.ModelId;
    }

    /**
     * Set 内置混流布局模板ID, 取值 [1, 2], 区别见内置混流布局模板样式示例说明
在没有填Custom字段时候，ModelId是必填的
     * @param ModelId 内置混流布局模板ID, 取值 [1, 2], 区别见内置混流布局模板样式示例说明
在没有填Custom字段时候，ModelId是必填的
     */
    public void setModelId(Long ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 老师用户ID
此字段只有在ModelId填了的情况下生效
填写TeacherId的效果是把指定为TeacherId的用户视频流显示在内置模板的第一个小画面中 
     * @return TeacherId 老师用户ID
此字段只有在ModelId填了的情况下生效
填写TeacherId的效果是把指定为TeacherId的用户视频流显示在内置模板的第一个小画面中
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set 老师用户ID
此字段只有在ModelId填了的情况下生效
填写TeacherId的效果是把指定为TeacherId的用户视频流显示在内置模板的第一个小画面中
     * @param TeacherId 老师用户ID
此字段只有在ModelId填了的情况下生效
填写TeacherId的效果是把指定为TeacherId的用户视频流显示在内置模板的第一个小画面中
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    /**
     * Get 自定义混流布局参数
当此字段存在时，ModelId 及 TeacherId 字段将被忽略 
     * @return Custom 自定义混流布局参数
当此字段存在时，ModelId 及 TeacherId 字段将被忽略
     */
    public CustomLayout getCustom() {
        return this.Custom;
    }

    /**
     * Set 自定义混流布局参数
当此字段存在时，ModelId 及 TeacherId 字段将被忽略
     * @param Custom 自定义混流布局参数
当此字段存在时，ModelId 及 TeacherId 字段将被忽略
     */
    public void setCustom(CustomLayout Custom) {
        this.Custom = Custom;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "DisableAudio", this.DisableAudio);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);
        this.setParamObj(map, prefix + "Custom.", this.Custom);

    }
}

