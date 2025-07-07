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

public class CreateResultPageConfig extends AbstractModel {

    /**
    * <ul>
  <li>0 : 发起审批成功页面（通过接口<a href="https://qian.tencent.com/developers/companyApis/embedPages/CreatePrepareFlow/" target="_blank">创建发起流程web页面</a>发起时设置了NeedCreateReview参数为true）</li>
</ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 结果页标题，不超过50字
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 结果页描述，不超过200字
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <ul>
  <li>0 : 发起审批成功页面（通过接口<a href="https://qian.tencent.com/developers/companyApis/embedPages/CreatePrepareFlow/" target="_blank">创建发起流程web页面</a>发起时设置了NeedCreateReview参数为true）</li>
</ul> 
     * @return Type <ul>
  <li>0 : 发起审批成功页面（通过接口<a href="https://qian.tencent.com/developers/companyApis/embedPages/CreatePrepareFlow/" target="_blank">创建发起流程web页面</a>发起时设置了NeedCreateReview参数为true）</li>
</ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <ul>
  <li>0 : 发起审批成功页面（通过接口<a href="https://qian.tencent.com/developers/companyApis/embedPages/CreatePrepareFlow/" target="_blank">创建发起流程web页面</a>发起时设置了NeedCreateReview参数为true）</li>
</ul>
     * @param Type <ul>
  <li>0 : 发起审批成功页面（通过接口<a href="https://qian.tencent.com/developers/companyApis/embedPages/CreatePrepareFlow/" target="_blank">创建发起流程web页面</a>发起时设置了NeedCreateReview参数为true）</li>
</ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 结果页标题，不超过50字 
     * @return Title 结果页标题，不超过50字
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 结果页标题，不超过50字
     * @param Title 结果页标题，不超过50字
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 结果页描述，不超过200字 
     * @return Description 结果页描述，不超过200字
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 结果页描述，不超过200字
     * @param Description 结果页描述，不超过200字
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateResultPageConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateResultPageConfig(CreateResultPageConfig source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

