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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApplicationRequest extends AbstractModel{

    /**
    * 应用SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * App名字
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 创建IM应用需要的SKey
    */
    @SerializedName("SKey")
    @Expose
    private String SKey;

    /**
    * 创建IM应用需要的TinyId
    */
    @SerializedName("TinyId")
    @Expose
    private String TinyId;

    /**
    * 需要绑定的标签列表
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
     * Get 应用SdkAppId 
     * @return SdkAppId 应用SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用SdkAppId
     * @param SdkAppId 应用SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get App名字 
     * @return AppName App名字
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set App名字
     * @param AppName App名字
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 创建IM应用需要的SKey 
     * @return SKey 创建IM应用需要的SKey
     */
    public String getSKey() {
        return this.SKey;
    }

    /**
     * Set 创建IM应用需要的SKey
     * @param SKey 创建IM应用需要的SKey
     */
    public void setSKey(String SKey) {
        this.SKey = SKey;
    }

    /**
     * Get 创建IM应用需要的TinyId 
     * @return TinyId 创建IM应用需要的TinyId
     */
    public String getTinyId() {
        return this.TinyId;
    }

    /**
     * Set 创建IM应用需要的TinyId
     * @param TinyId 创建IM应用需要的TinyId
     */
    public void setTinyId(String TinyId) {
        this.TinyId = TinyId;
    }

    /**
     * Get 需要绑定的标签列表 
     * @return TagList 需要绑定的标签列表
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 需要绑定的标签列表
     * @param TagList 需要绑定的标签列表
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    public CreateApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationRequest(CreateApplicationRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.SKey != null) {
            this.SKey = new String(source.SKey);
        }
        if (source.TinyId != null) {
            this.TinyId = new String(source.TinyId);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "SKey", this.SKey);
        this.setParamSimple(map, prefix + "TinyId", this.TinyId);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

