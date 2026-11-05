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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLocationRequest extends AbstractModel {

    /**
    * COS 文件事件订阅配置，可选；不设置时不订阅（仅 COS 类型 Location 生效）。设置时先订阅 COS 桶事件投递到 CKafka 再创建 Location，创建失败自动回滚退订
    */
    @SerializedName("FileEventSubscription")
    @Expose
    private CosEventSubscription FileEventSubscription;

    /**
     * Get COS 文件事件订阅配置，可选；不设置时不订阅（仅 COS 类型 Location 生效）。设置时先订阅 COS 桶事件投递到 CKafka 再创建 Location，创建失败自动回滚退订 
     * @return FileEventSubscription COS 文件事件订阅配置，可选；不设置时不订阅（仅 COS 类型 Location 生效）。设置时先订阅 COS 桶事件投递到 CKafka 再创建 Location，创建失败自动回滚退订
     */
    public CosEventSubscription getFileEventSubscription() {
        return this.FileEventSubscription;
    }

    /**
     * Set COS 文件事件订阅配置，可选；不设置时不订阅（仅 COS 类型 Location 生效）。设置时先订阅 COS 桶事件投递到 CKafka 再创建 Location，创建失败自动回滚退订
     * @param FileEventSubscription COS 文件事件订阅配置，可选；不设置时不订阅（仅 COS 类型 Location 生效）。设置时先订阅 COS 桶事件投递到 CKafka 再创建 Location，创建失败自动回滚退订
     */
    public void setFileEventSubscription(CosEventSubscription FileEventSubscription) {
        this.FileEventSubscription = FileEventSubscription;
    }

    public CreateLocationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLocationRequest(CreateLocationRequest source) {
        if (source.FileEventSubscription != null) {
            this.FileEventSubscription = new CosEventSubscription(source.FileEventSubscription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FileEventSubscription.", this.FileEventSubscription);

    }
}

