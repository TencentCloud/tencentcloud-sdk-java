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

public class EnablePGDocumentExtRequest extends AbstractModel {

    /**
    * <p>环境 id，租户级标识信息，开通环境时产生，全局唯一</p><p>参数格式：用户自定义小写英文命名 + 随机雪花字符</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
     * Get <p>环境 id，租户级标识信息，开通环境时产生，全局唯一</p><p>参数格式：用户自定义小写英文命名 + 随机雪花字符</p> 
     * @return EnvId <p>环境 id，租户级标识信息，开通环境时产生，全局唯一</p><p>参数格式：用户自定义小写英文命名 + 随机雪花字符</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境 id，租户级标识信息，开通环境时产生，全局唯一</p><p>参数格式：用户自定义小写英文命名 + 随机雪花字符</p>
     * @param EnvId <p>环境 id，租户级标识信息，开通环境时产生，全局唯一</p><p>参数格式：用户自定义小写英文命名 + 随机雪花字符</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    public EnablePGDocumentExtRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnablePGDocumentExtRequest(EnablePGDocumentExtRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);

    }
}

