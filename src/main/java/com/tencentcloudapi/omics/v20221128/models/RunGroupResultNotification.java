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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunGroupResultNotification extends AbstractModel {

    /**
    * 通知类型。
    */
    @SerializedName("NotificationType")
    @Expose
    private NotificationType NotificationType;

    /**
     * Get 通知类型。 
     * @return NotificationType 通知类型。
     */
    public NotificationType getNotificationType() {
        return this.NotificationType;
    }

    /**
     * Set 通知类型。
     * @param NotificationType 通知类型。
     */
    public void setNotificationType(NotificationType NotificationType) {
        this.NotificationType = NotificationType;
    }

    public RunGroupResultNotification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunGroupResultNotification(RunGroupResultNotification source) {
        if (source.NotificationType != null) {
            this.NotificationType = new NotificationType(source.NotificationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "NotificationType.", this.NotificationType);

    }
}

