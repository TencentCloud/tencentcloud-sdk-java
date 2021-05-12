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
package com.tencentcloudapi.vm.v20200709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBizConfigRequest extends AbstractModel{

    /**
    * 业务ID，仅限英文字母、数字和下划线（_）组成，长度不超过8位
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 审核分类信息
    */
    @SerializedName("MediaModeration")
    @Expose
    private MediaModerationConfig MediaModeration;

    /**
    * 业务名称，用于标识业务场景，长度不超过32位
    */
    @SerializedName("BizName")
    @Expose
    private String BizName;

    /**
    * 审核内容，可选：Polity (政治); Porn (色情); Illegal(违法);Abuse (谩骂); Terror (暴恐); Ad (广告); Custom (自定义);
    */
    @SerializedName("ModerationCategories")
    @Expose
    private String [] ModerationCategories;

    /**
     * Get 业务ID，仅限英文字母、数字和下划线（_）组成，长度不超过8位 
     * @return BizType 业务ID，仅限英文字母、数字和下划线（_）组成，长度不超过8位
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 业务ID，仅限英文字母、数字和下划线（_）组成，长度不超过8位
     * @param BizType 业务ID，仅限英文字母、数字和下划线（_）组成，长度不超过8位
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 审核分类信息 
     * @return MediaModeration 审核分类信息
     */
    public MediaModerationConfig getMediaModeration() {
        return this.MediaModeration;
    }

    /**
     * Set 审核分类信息
     * @param MediaModeration 审核分类信息
     */
    public void setMediaModeration(MediaModerationConfig MediaModeration) {
        this.MediaModeration = MediaModeration;
    }

    /**
     * Get 业务名称，用于标识业务场景，长度不超过32位 
     * @return BizName 业务名称，用于标识业务场景，长度不超过32位
     */
    public String getBizName() {
        return this.BizName;
    }

    /**
     * Set 业务名称，用于标识业务场景，长度不超过32位
     * @param BizName 业务名称，用于标识业务场景，长度不超过32位
     */
    public void setBizName(String BizName) {
        this.BizName = BizName;
    }

    /**
     * Get 审核内容，可选：Polity (政治); Porn (色情); Illegal(违法);Abuse (谩骂); Terror (暴恐); Ad (广告); Custom (自定义); 
     * @return ModerationCategories 审核内容，可选：Polity (政治); Porn (色情); Illegal(违法);Abuse (谩骂); Terror (暴恐); Ad (广告); Custom (自定义);
     */
    public String [] getModerationCategories() {
        return this.ModerationCategories;
    }

    /**
     * Set 审核内容，可选：Polity (政治); Porn (色情); Illegal(违法);Abuse (谩骂); Terror (暴恐); Ad (广告); Custom (自定义);
     * @param ModerationCategories 审核内容，可选：Polity (政治); Porn (色情); Illegal(违法);Abuse (谩骂); Terror (暴恐); Ad (广告); Custom (自定义);
     */
    public void setModerationCategories(String [] ModerationCategories) {
        this.ModerationCategories = ModerationCategories;
    }

    public CreateBizConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBizConfigRequest(CreateBizConfigRequest source) {
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.MediaModeration != null) {
            this.MediaModeration = new MediaModerationConfig(source.MediaModeration);
        }
        if (source.BizName != null) {
            this.BizName = new String(source.BizName);
        }
        if (source.ModerationCategories != null) {
            this.ModerationCategories = new String[source.ModerationCategories.length];
            for (int i = 0; i < source.ModerationCategories.length; i++) {
                this.ModerationCategories[i] = new String(source.ModerationCategories[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamObj(map, prefix + "MediaModeration.", this.MediaModeration);
        this.setParamSimple(map, prefix + "BizName", this.BizName);
        this.setParamArraySimple(map, prefix + "ModerationCategories.", this.ModerationCategories);

    }
}

