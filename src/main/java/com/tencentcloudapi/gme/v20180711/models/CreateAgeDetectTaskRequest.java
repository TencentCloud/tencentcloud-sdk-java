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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAgeDetectTaskRequest extends AbstractModel{

    /**
    * 应用id
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 语音检测子任务列表，列表最多支持100个检测子任务。结构体中包含：
<li>DataId：数据的唯一ID</li>
<li>Url：数据文件的url，为 urlencode 编码，流式则为拉流地址</li>
    */
    @SerializedName("Tasks")
    @Expose
    private AgeDetectTask [] Tasks;

    /**
    * 任务结束时gme后台会自动触发回调
    */
    @SerializedName("Callback")
    @Expose
    private String Callback;

    /**
     * Get 应用id 
     * @return BizId 应用id
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用id
     * @param BizId 应用id
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 语音检测子任务列表，列表最多支持100个检测子任务。结构体中包含：
<li>DataId：数据的唯一ID</li>
<li>Url：数据文件的url，为 urlencode 编码，流式则为拉流地址</li> 
     * @return Tasks 语音检测子任务列表，列表最多支持100个检测子任务。结构体中包含：
<li>DataId：数据的唯一ID</li>
<li>Url：数据文件的url，为 urlencode 编码，流式则为拉流地址</li>
     */
    public AgeDetectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 语音检测子任务列表，列表最多支持100个检测子任务。结构体中包含：
<li>DataId：数据的唯一ID</li>
<li>Url：数据文件的url，为 urlencode 编码，流式则为拉流地址</li>
     * @param Tasks 语音检测子任务列表，列表最多支持100个检测子任务。结构体中包含：
<li>DataId：数据的唯一ID</li>
<li>Url：数据文件的url，为 urlencode 编码，流式则为拉流地址</li>
     */
    public void setTasks(AgeDetectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 任务结束时gme后台会自动触发回调 
     * @return Callback 任务结束时gme后台会自动触发回调
     */
    public String getCallback() {
        return this.Callback;
    }

    /**
     * Set 任务结束时gme后台会自动触发回调
     * @param Callback 任务结束时gme后台会自动触发回调
     */
    public void setCallback(String Callback) {
        this.Callback = Callback;
    }

    public CreateAgeDetectTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAgeDetectTaskRequest(CreateAgeDetectTaskRequest source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.Tasks != null) {
            this.Tasks = new AgeDetectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new AgeDetectTask(source.Tasks[i]);
            }
        }
        if (source.Callback != null) {
            this.Callback = new String(source.Callback);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "Callback", this.Callback);

    }
}

