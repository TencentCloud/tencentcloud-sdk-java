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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProjectSecModeRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 安全模式  
0：关闭项目共享密钥 
1：开启项目共享密钥
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 项目密钥 32位 小写英文+数字；  项目密钥模式必填
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 自动注册方式
0：关闭自动注册
1：仅允许现场设备自动注册
2：仅允许远端设备自动注册
3：允许现场和远端设备均自动注册
    */
    @SerializedName("AutoRegister")
    @Expose
    private Long AutoRegister;

    /**
    * 是否允许远端获取现场设备列表（getGwList）
0：不允许
1：允许
    */
    @SerializedName("FieldListEnable")
    @Expose
    private Long FieldListEnable;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 安全模式  
0：关闭项目共享密钥 
1：开启项目共享密钥 
     * @return Mode 安全模式  
0：关闭项目共享密钥 
1：开启项目共享密钥
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 安全模式  
0：关闭项目共享密钥 
1：开启项目共享密钥
     * @param Mode 安全模式  
0：关闭项目共享密钥 
1：开启项目共享密钥
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 项目密钥 32位 小写英文+数字；  项目密钥模式必填 
     * @return Key 项目密钥 32位 小写英文+数字；  项目密钥模式必填
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 项目密钥 32位 小写英文+数字；  项目密钥模式必填
     * @param Key 项目密钥 32位 小写英文+数字；  项目密钥模式必填
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 自动注册方式
0：关闭自动注册
1：仅允许现场设备自动注册
2：仅允许远端设备自动注册
3：允许现场和远端设备均自动注册 
     * @return AutoRegister 自动注册方式
0：关闭自动注册
1：仅允许现场设备自动注册
2：仅允许远端设备自动注册
3：允许现场和远端设备均自动注册
     */
    public Long getAutoRegister() {
        return this.AutoRegister;
    }

    /**
     * Set 自动注册方式
0：关闭自动注册
1：仅允许现场设备自动注册
2：仅允许远端设备自动注册
3：允许现场和远端设备均自动注册
     * @param AutoRegister 自动注册方式
0：关闭自动注册
1：仅允许现场设备自动注册
2：仅允许远端设备自动注册
3：允许现场和远端设备均自动注册
     */
    public void setAutoRegister(Long AutoRegister) {
        this.AutoRegister = AutoRegister;
    }

    /**
     * Get 是否允许远端获取现场设备列表（getGwList）
0：不允许
1：允许 
     * @return FieldListEnable 是否允许远端获取现场设备列表（getGwList）
0：不允许
1：允许
     */
    public Long getFieldListEnable() {
        return this.FieldListEnable;
    }

    /**
     * Set 是否允许远端获取现场设备列表（getGwList）
0：不允许
1：允许
     * @param FieldListEnable 是否允许远端获取现场设备列表（getGwList）
0：不允许
1：允许
     */
    public void setFieldListEnable(Long FieldListEnable) {
        this.FieldListEnable = FieldListEnable;
    }

    public ModifyProjectSecModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProjectSecModeRequest(ModifyProjectSecModeRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.AutoRegister != null) {
            this.AutoRegister = new Long(source.AutoRegister);
        }
        if (source.FieldListEnable != null) {
            this.FieldListEnable = new Long(source.FieldListEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "AutoRegister", this.AutoRegister);
        this.setParamSimple(map, prefix + "FieldListEnable", this.FieldListEnable);

    }
}

