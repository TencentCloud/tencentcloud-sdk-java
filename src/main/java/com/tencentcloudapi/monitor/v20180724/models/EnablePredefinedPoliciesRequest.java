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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnablePredefinedPoliciesRequest extends AbstractModel {

    /**
    * 预设配置id
    */
    @SerializedName("PredefinedConfigID")
    @Expose
    private String PredefinedConfigID;

    /**
    * 云产品id
    */
    @SerializedName("PredefinedGroupID")
    @Expose
    private String PredefinedGroupID;

    /**
    * 通知模板id
    */
    @SerializedName("NoticeIDs")
    @Expose
    private String [] NoticeIDs;

    /**
     * Get 预设配置id 
     * @return PredefinedConfigID 预设配置id
     */
    public String getPredefinedConfigID() {
        return this.PredefinedConfigID;
    }

    /**
     * Set 预设配置id
     * @param PredefinedConfigID 预设配置id
     */
    public void setPredefinedConfigID(String PredefinedConfigID) {
        this.PredefinedConfigID = PredefinedConfigID;
    }

    /**
     * Get 云产品id 
     * @return PredefinedGroupID 云产品id
     */
    public String getPredefinedGroupID() {
        return this.PredefinedGroupID;
    }

    /**
     * Set 云产品id
     * @param PredefinedGroupID 云产品id
     */
    public void setPredefinedGroupID(String PredefinedGroupID) {
        this.PredefinedGroupID = PredefinedGroupID;
    }

    /**
     * Get 通知模板id 
     * @return NoticeIDs 通知模板id
     */
    public String [] getNoticeIDs() {
        return this.NoticeIDs;
    }

    /**
     * Set 通知模板id
     * @param NoticeIDs 通知模板id
     */
    public void setNoticeIDs(String [] NoticeIDs) {
        this.NoticeIDs = NoticeIDs;
    }

    public EnablePredefinedPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnablePredefinedPoliciesRequest(EnablePredefinedPoliciesRequest source) {
        if (source.PredefinedConfigID != null) {
            this.PredefinedConfigID = new String(source.PredefinedConfigID);
        }
        if (source.PredefinedGroupID != null) {
            this.PredefinedGroupID = new String(source.PredefinedGroupID);
        }
        if (source.NoticeIDs != null) {
            this.NoticeIDs = new String[source.NoticeIDs.length];
            for (int i = 0; i < source.NoticeIDs.length; i++) {
                this.NoticeIDs[i] = new String(source.NoticeIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PredefinedConfigID", this.PredefinedConfigID);
        this.setParamSimple(map, prefix + "PredefinedGroupID", this.PredefinedGroupID);
        this.setParamArraySimple(map, prefix + "NoticeIDs.", this.NoticeIDs);

    }
}

