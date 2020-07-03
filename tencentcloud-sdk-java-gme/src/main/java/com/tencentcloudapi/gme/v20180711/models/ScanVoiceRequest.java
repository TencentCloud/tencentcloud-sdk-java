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

public class ScanVoiceRequest extends AbstractModel{

    /**
    * 应用ID，登录[控制台 - 服务管理](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 语音检测场景，参数值目前要求为 default。 预留场景设置： 谩骂、色情、涉政、广告、暴恐、违禁等场景，<a href="#Label_Value">具体取值见上述 Label 说明。</a>
    */
    @SerializedName("Scenes")
    @Expose
    private String [] Scenes;

    /**
    * 是否为直播流。值为 false 时表示普通语音文件检测；为 true 时表示语音流检测。
    */
    @SerializedName("Live")
    @Expose
    private Boolean Live;

    /**
    * 语音检测任务列表，列表最多支持100个检测任务。结构体中包含：
<li>DataId：数据的唯一ID</li>
<li>Url：数据文件的url，为 urlencode 编码，流式则为拉流地址</li>
    */
    @SerializedName("Tasks")
    @Expose
    private Task [] Tasks;

    /**
    * 异步检测结果回调地址，具体见上述<a href="#Callback_Declare">回调相关说明</a>。（说明：该字段为空时，必须通过接口(查询语音检测结果)获取检测结果）。
    */
    @SerializedName("Callback")
    @Expose
    private String Callback;

    /**
     * Get 应用ID，登录[控制台 - 服务管理](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID 
     * @return BizId 应用ID，登录[控制台 - 服务管理](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用ID，登录[控制台 - 服务管理](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID
     * @param BizId 应用ID，登录[控制台 - 服务管理](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 语音检测场景，参数值目前要求为 default。 预留场景设置： 谩骂、色情、涉政、广告、暴恐、违禁等场景，<a href="#Label_Value">具体取值见上述 Label 说明。</a> 
     * @return Scenes 语音检测场景，参数值目前要求为 default。 预留场景设置： 谩骂、色情、涉政、广告、暴恐、违禁等场景，<a href="#Label_Value">具体取值见上述 Label 说明。</a>
     */
    public String [] getScenes() {
        return this.Scenes;
    }

    /**
     * Set 语音检测场景，参数值目前要求为 default。 预留场景设置： 谩骂、色情、涉政、广告、暴恐、违禁等场景，<a href="#Label_Value">具体取值见上述 Label 说明。</a>
     * @param Scenes 语音检测场景，参数值目前要求为 default。 预留场景设置： 谩骂、色情、涉政、广告、暴恐、违禁等场景，<a href="#Label_Value">具体取值见上述 Label 说明。</a>
     */
    public void setScenes(String [] Scenes) {
        this.Scenes = Scenes;
    }

    /**
     * Get 是否为直播流。值为 false 时表示普通语音文件检测；为 true 时表示语音流检测。 
     * @return Live 是否为直播流。值为 false 时表示普通语音文件检测；为 true 时表示语音流检测。
     */
    public Boolean getLive() {
        return this.Live;
    }

    /**
     * Set 是否为直播流。值为 false 时表示普通语音文件检测；为 true 时表示语音流检测。
     * @param Live 是否为直播流。值为 false 时表示普通语音文件检测；为 true 时表示语音流检测。
     */
    public void setLive(Boolean Live) {
        this.Live = Live;
    }

    /**
     * Get 语音检测任务列表，列表最多支持100个检测任务。结构体中包含：
<li>DataId：数据的唯一ID</li>
<li>Url：数据文件的url，为 urlencode 编码，流式则为拉流地址</li> 
     * @return Tasks 语音检测任务列表，列表最多支持100个检测任务。结构体中包含：
<li>DataId：数据的唯一ID</li>
<li>Url：数据文件的url，为 urlencode 编码，流式则为拉流地址</li>
     */
    public Task [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 语音检测任务列表，列表最多支持100个检测任务。结构体中包含：
<li>DataId：数据的唯一ID</li>
<li>Url：数据文件的url，为 urlencode 编码，流式则为拉流地址</li>
     * @param Tasks 语音检测任务列表，列表最多支持100个检测任务。结构体中包含：
<li>DataId：数据的唯一ID</li>
<li>Url：数据文件的url，为 urlencode 编码，流式则为拉流地址</li>
     */
    public void setTasks(Task [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 异步检测结果回调地址，具体见上述<a href="#Callback_Declare">回调相关说明</a>。（说明：该字段为空时，必须通过接口(查询语音检测结果)获取检测结果）。 
     * @return Callback 异步检测结果回调地址，具体见上述<a href="#Callback_Declare">回调相关说明</a>。（说明：该字段为空时，必须通过接口(查询语音检测结果)获取检测结果）。
     */
    public String getCallback() {
        return this.Callback;
    }

    /**
     * Set 异步检测结果回调地址，具体见上述<a href="#Callback_Declare">回调相关说明</a>。（说明：该字段为空时，必须通过接口(查询语音检测结果)获取检测结果）。
     * @param Callback 异步检测结果回调地址，具体见上述<a href="#Callback_Declare">回调相关说明</a>。（说明：该字段为空时，必须通过接口(查询语音检测结果)获取检测结果）。
     */
    public void setCallback(String Callback) {
        this.Callback = Callback;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamArraySimple(map, prefix + "Scenes.", this.Scenes);
        this.setParamSimple(map, prefix + "Live", this.Live);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "Callback", this.Callback);

    }
}

