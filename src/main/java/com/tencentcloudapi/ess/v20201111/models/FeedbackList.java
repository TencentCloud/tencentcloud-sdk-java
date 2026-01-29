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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FeedbackList extends AbstractModel {

    /**
    * 信息提取结果字段ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 反馈信息
    */
    @SerializedName("Info")
    @Expose
    private FeedbackInfo Info;

    /**
     * Get 信息提取结果字段ID 
     * @return Id 信息提取结果字段ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 信息提取结果字段ID
     * @param Id 信息提取结果字段ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 反馈信息 
     * @return Info 反馈信息
     */
    public FeedbackInfo getInfo() {
        return this.Info;
    }

    /**
     * Set 反馈信息
     * @param Info 反馈信息
     */
    public void setInfo(FeedbackInfo Info) {
        this.Info = Info;
    }

    public FeedbackList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FeedbackList(FeedbackList source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Info != null) {
            this.Info = new FeedbackInfo(source.Info);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "Info.", this.Info);

    }
}

