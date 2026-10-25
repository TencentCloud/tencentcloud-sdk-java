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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTDEMSampleConfigRequest extends AbstractModel {

    /**
    * <p>应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>事件采样配置 JSON 字符串。反序列化后：{"Enabled":bool,"Types":{&lt;event_type&gt;:{"SampleRate":0-100最多两位小数,"Rules":[{"Name":string,"Enabled":bool,"SampleRate":0-100,"Conditions":[{"Field":string,"Operator":string,"Value":string或string[]}]}]}}}。Types 可只含改过的 type；未出现的 type 服务端视为 100% + 空规则。Types key 闭集：js_error,promise_error,resource_error,api_error,blank_screen,no_response,page_load,web_vitals,lag_detected,memory_usage,memory_oom,resource_load,api_call,sse_call,click,page_view,tab_hidden,tab_visible,form_focus,form_blur,form_change,form_submit,form_submit_result,struggle,custom,log（不含 rage_click/lcp）。Operator 白名单：equals,not_equals,contains,not_contains,in,not_in,starts_with,ends_with。规则 Conditions 至少 1 条；in/not_in 的 Value 为字符串数组。</p>
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
    * <p>回放采样配置 JSON 字符串。反序列化后：{"Enabled":bool,"ExperienceSampleRate":0-100最多两位小数,"ErrorTraceback":bool,"ErrorSampleRate":0-100最多两位小数}。控制台/远程字段名为 ExperienceSampleRate（非 SessionSampleRate）。</p>
    */
    @SerializedName("Replay")
    @Expose
    private String Replay;

    /**
     * Get <p>应用ID</p> 
     * @return AppId <p>应用ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用ID</p>
     * @param AppId <p>应用ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>事件采样配置 JSON 字符串。反序列化后：{"Enabled":bool,"Types":{&lt;event_type&gt;:{"SampleRate":0-100最多两位小数,"Rules":[{"Name":string,"Enabled":bool,"SampleRate":0-100,"Conditions":[{"Field":string,"Operator":string,"Value":string或string[]}]}]}}}。Types 可只含改过的 type；未出现的 type 服务端视为 100% + 空规则。Types key 闭集：js_error,promise_error,resource_error,api_error,blank_screen,no_response,page_load,web_vitals,lag_detected,memory_usage,memory_oom,resource_load,api_call,sse_call,click,page_view,tab_hidden,tab_visible,form_focus,form_blur,form_change,form_submit,form_submit_result,struggle,custom,log（不含 rage_click/lcp）。Operator 白名单：equals,not_equals,contains,not_contains,in,not_in,starts_with,ends_with。规则 Conditions 至少 1 条；in/not_in 的 Value 为字符串数组。</p> 
     * @return Event <p>事件采样配置 JSON 字符串。反序列化后：{"Enabled":bool,"Types":{&lt;event_type&gt;:{"SampleRate":0-100最多两位小数,"Rules":[{"Name":string,"Enabled":bool,"SampleRate":0-100,"Conditions":[{"Field":string,"Operator":string,"Value":string或string[]}]}]}}}。Types 可只含改过的 type；未出现的 type 服务端视为 100% + 空规则。Types key 闭集：js_error,promise_error,resource_error,api_error,blank_screen,no_response,page_load,web_vitals,lag_detected,memory_usage,memory_oom,resource_load,api_call,sse_call,click,page_view,tab_hidden,tab_visible,form_focus,form_blur,form_change,form_submit,form_submit_result,struggle,custom,log（不含 rage_click/lcp）。Operator 白名单：equals,not_equals,contains,not_contains,in,not_in,starts_with,ends_with。规则 Conditions 至少 1 条；in/not_in 的 Value 为字符串数组。</p>
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * Set <p>事件采样配置 JSON 字符串。反序列化后：{"Enabled":bool,"Types":{&lt;event_type&gt;:{"SampleRate":0-100最多两位小数,"Rules":[{"Name":string,"Enabled":bool,"SampleRate":0-100,"Conditions":[{"Field":string,"Operator":string,"Value":string或string[]}]}]}}}。Types 可只含改过的 type；未出现的 type 服务端视为 100% + 空规则。Types key 闭集：js_error,promise_error,resource_error,api_error,blank_screen,no_response,page_load,web_vitals,lag_detected,memory_usage,memory_oom,resource_load,api_call,sse_call,click,page_view,tab_hidden,tab_visible,form_focus,form_blur,form_change,form_submit,form_submit_result,struggle,custom,log（不含 rage_click/lcp）。Operator 白名单：equals,not_equals,contains,not_contains,in,not_in,starts_with,ends_with。规则 Conditions 至少 1 条；in/not_in 的 Value 为字符串数组。</p>
     * @param Event <p>事件采样配置 JSON 字符串。反序列化后：{"Enabled":bool,"Types":{&lt;event_type&gt;:{"SampleRate":0-100最多两位小数,"Rules":[{"Name":string,"Enabled":bool,"SampleRate":0-100,"Conditions":[{"Field":string,"Operator":string,"Value":string或string[]}]}]}}}。Types 可只含改过的 type；未出现的 type 服务端视为 100% + 空规则。Types key 闭集：js_error,promise_error,resource_error,api_error,blank_screen,no_response,page_load,web_vitals,lag_detected,memory_usage,memory_oom,resource_load,api_call,sse_call,click,page_view,tab_hidden,tab_visible,form_focus,form_blur,form_change,form_submit,form_submit_result,struggle,custom,log（不含 rage_click/lcp）。Operator 白名单：equals,not_equals,contains,not_contains,in,not_in,starts_with,ends_with。规则 Conditions 至少 1 条；in/not_in 的 Value 为字符串数组。</p>
     */
    public void setEvent(String Event) {
        this.Event = Event;
    }

    /**
     * Get <p>回放采样配置 JSON 字符串。反序列化后：{"Enabled":bool,"ExperienceSampleRate":0-100最多两位小数,"ErrorTraceback":bool,"ErrorSampleRate":0-100最多两位小数}。控制台/远程字段名为 ExperienceSampleRate（非 SessionSampleRate）。</p> 
     * @return Replay <p>回放采样配置 JSON 字符串。反序列化后：{"Enabled":bool,"ExperienceSampleRate":0-100最多两位小数,"ErrorTraceback":bool,"ErrorSampleRate":0-100最多两位小数}。控制台/远程字段名为 ExperienceSampleRate（非 SessionSampleRate）。</p>
     */
    public String getReplay() {
        return this.Replay;
    }

    /**
     * Set <p>回放采样配置 JSON 字符串。反序列化后：{"Enabled":bool,"ExperienceSampleRate":0-100最多两位小数,"ErrorTraceback":bool,"ErrorSampleRate":0-100最多两位小数}。控制台/远程字段名为 ExperienceSampleRate（非 SessionSampleRate）。</p>
     * @param Replay <p>回放采样配置 JSON 字符串。反序列化后：{"Enabled":bool,"ExperienceSampleRate":0-100最多两位小数,"ErrorTraceback":bool,"ErrorSampleRate":0-100最多两位小数}。控制台/远程字段名为 ExperienceSampleRate（非 SessionSampleRate）。</p>
     */
    public void setReplay(String Replay) {
        this.Replay = Replay;
    }

    public ModifyTDEMSampleConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTDEMSampleConfigRequest(ModifyTDEMSampleConfigRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Event != null) {
            this.Event = new String(source.Event);
        }
        if (source.Replay != null) {
            this.Replay = new String(source.Replay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Event", this.Event);
        this.setParamSimple(map, prefix + "Replay", this.Replay);

    }
}

