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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDspmAccessRecordRequest extends AbstractModel {

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 来源ip
    */
    @SerializedName("Id")
    @Expose
    private DspmAccessRecordId [] Id;

    /**
    * 视图。ip或instance
    */
    @SerializedName("View")
    @Expose
    private String View;

    /**
    * 阅读标记。 1-已阅
    */
    @SerializedName("Noted")
    @Expose
    private Long Noted;

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 来源ip 
     * @return Id 来源ip
     */
    public DspmAccessRecordId [] getId() {
        return this.Id;
    }

    /**
     * Set 来源ip
     * @param Id 来源ip
     */
    public void setId(DspmAccessRecordId [] Id) {
        this.Id = Id;
    }

    /**
     * Get 视图。ip或instance 
     * @return View 视图。ip或instance
     */
    public String getView() {
        return this.View;
    }

    /**
     * Set 视图。ip或instance
     * @param View 视图。ip或instance
     */
    public void setView(String View) {
        this.View = View;
    }

    /**
     * Get 阅读标记。 1-已阅 
     * @return Noted 阅读标记。 1-已阅
     */
    public Long getNoted() {
        return this.Noted;
    }

    /**
     * Set 阅读标记。 1-已阅
     * @param Noted 阅读标记。 1-已阅
     */
    public void setNoted(Long Noted) {
        this.Noted = Noted;
    }

    public ModifyDspmAccessRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmAccessRecordRequest(ModifyDspmAccessRecordRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new DspmAccessRecordId[source.Id.length];
            for (int i = 0; i < source.Id.length; i++) {
                this.Id[i] = new DspmAccessRecordId(source.Id[i]);
            }
        }
        if (source.View != null) {
            this.View = new String(source.View);
        }
        if (source.Noted != null) {
            this.Noted = new Long(source.Noted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Id.", this.Id);
        this.setParamSimple(map, prefix + "View", this.View);
        this.setParamSimple(map, prefix + "Noted", this.Noted);

    }
}

