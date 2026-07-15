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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAgentApplicationRequest extends AbstractModel {

    /**
    * <p>应用id</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>是否删除agent应用关联的主题</p><p>枚举值：</p><ul><li>false： 不删除agent应用关联的主题</li><li>true： 删除agent应用关联的主题</li></ul><p>默认值：false</p>
    */
    @SerializedName("DeleteTopics")
    @Expose
    private Boolean DeleteTopics;

    /**
     * Get <p>应用id</p> 
     * @return ApplicationId <p>应用id</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>应用id</p>
     * @param ApplicationId <p>应用id</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>是否删除agent应用关联的主题</p><p>枚举值：</p><ul><li>false： 不删除agent应用关联的主题</li><li>true： 删除agent应用关联的主题</li></ul><p>默认值：false</p> 
     * @return DeleteTopics <p>是否删除agent应用关联的主题</p><p>枚举值：</p><ul><li>false： 不删除agent应用关联的主题</li><li>true： 删除agent应用关联的主题</li></ul><p>默认值：false</p>
     */
    public Boolean getDeleteTopics() {
        return this.DeleteTopics;
    }

    /**
     * Set <p>是否删除agent应用关联的主题</p><p>枚举值：</p><ul><li>false： 不删除agent应用关联的主题</li><li>true： 删除agent应用关联的主题</li></ul><p>默认值：false</p>
     * @param DeleteTopics <p>是否删除agent应用关联的主题</p><p>枚举值：</p><ul><li>false： 不删除agent应用关联的主题</li><li>true： 删除agent应用关联的主题</li></ul><p>默认值：false</p>
     */
    public void setDeleteTopics(Boolean DeleteTopics) {
        this.DeleteTopics = DeleteTopics;
    }

    public DeleteAgentApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAgentApplicationRequest(DeleteAgentApplicationRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.DeleteTopics != null) {
            this.DeleteTopics = new Boolean(source.DeleteTopics);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "DeleteTopics", this.DeleteTopics);

    }
}

