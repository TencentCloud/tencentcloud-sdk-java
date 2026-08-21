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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetAndroidInstancesRequest extends AbstractModel {

    /**
    * <p>实例ID列表</p>
    */
    @SerializedName("AndroidInstanceIds")
    @Expose
    private String [] AndroidInstanceIds;

    /**
    * <p>指定有效的镜像 ID。<br>默认取值：默认使用当前镜像。</p>
    */
    @SerializedName("AndroidInstanceImageId")
    @Expose
    private String AndroidInstanceImageId;

    /**
    * <p>重置模式。在 AndroidInstanceImageId 不为空时才生效。</p><p>CleanData：默认选项，清理系统属性和用户数据<br>KeepSystemProperties：只保留系统属性<br>KeepData: 保留系统属性和用户数据</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * Get <p>实例ID列表</p> 
     * @return AndroidInstanceIds <p>实例ID列表</p>
     */
    public String [] getAndroidInstanceIds() {
        return this.AndroidInstanceIds;
    }

    /**
     * Set <p>实例ID列表</p>
     * @param AndroidInstanceIds <p>实例ID列表</p>
     */
    public void setAndroidInstanceIds(String [] AndroidInstanceIds) {
        this.AndroidInstanceIds = AndroidInstanceIds;
    }

    /**
     * Get <p>指定有效的镜像 ID。<br>默认取值：默认使用当前镜像。</p> 
     * @return AndroidInstanceImageId <p>指定有效的镜像 ID。<br>默认取值：默认使用当前镜像。</p>
     */
    public String getAndroidInstanceImageId() {
        return this.AndroidInstanceImageId;
    }

    /**
     * Set <p>指定有效的镜像 ID。<br>默认取值：默认使用当前镜像。</p>
     * @param AndroidInstanceImageId <p>指定有效的镜像 ID。<br>默认取值：默认使用当前镜像。</p>
     */
    public void setAndroidInstanceImageId(String AndroidInstanceImageId) {
        this.AndroidInstanceImageId = AndroidInstanceImageId;
    }

    /**
     * Get <p>重置模式。在 AndroidInstanceImageId 不为空时才生效。</p><p>CleanData：默认选项，清理系统属性和用户数据<br>KeepSystemProperties：只保留系统属性<br>KeepData: 保留系统属性和用户数据</p> 
     * @return Mode <p>重置模式。在 AndroidInstanceImageId 不为空时才生效。</p><p>CleanData：默认选项，清理系统属性和用户数据<br>KeepSystemProperties：只保留系统属性<br>KeepData: 保留系统属性和用户数据</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>重置模式。在 AndroidInstanceImageId 不为空时才生效。</p><p>CleanData：默认选项，清理系统属性和用户数据<br>KeepSystemProperties：只保留系统属性<br>KeepData: 保留系统属性和用户数据</p>
     * @param Mode <p>重置模式。在 AndroidInstanceImageId 不为空时才生效。</p><p>CleanData：默认选项，清理系统属性和用户数据<br>KeepSystemProperties：只保留系统属性<br>KeepData: 保留系统属性和用户数据</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    public ResetAndroidInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetAndroidInstancesRequest(ResetAndroidInstancesRequest source) {
        if (source.AndroidInstanceIds != null) {
            this.AndroidInstanceIds = new String[source.AndroidInstanceIds.length];
            for (int i = 0; i < source.AndroidInstanceIds.length; i++) {
                this.AndroidInstanceIds[i] = new String(source.AndroidInstanceIds[i]);
            }
        }
        if (source.AndroidInstanceImageId != null) {
            this.AndroidInstanceImageId = new String(source.AndroidInstanceImageId);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AndroidInstanceIds.", this.AndroidInstanceIds);
        this.setParamSimple(map, prefix + "AndroidInstanceImageId", this.AndroidInstanceImageId);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

