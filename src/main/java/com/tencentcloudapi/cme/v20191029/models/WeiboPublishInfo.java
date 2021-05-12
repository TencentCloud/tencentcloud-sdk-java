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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WeiboPublishInfo extends AbstractModel{

    /**
    * 视频发布标题。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 视频发布描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 微博可见性，可取值为：
<li>Public：公开，所有人可见；</li>
<li>Private：私有，仅自己可见。</li>

默认为 Public，所有人可见。
    */
    @SerializedName("Visible")
    @Expose
    private String Visible;

    /**
     * Get 视频发布标题。 
     * @return Title 视频发布标题。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 视频发布标题。
     * @param Title 视频发布标题。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 视频发布描述信息。 
     * @return Description 视频发布描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 视频发布描述信息。
     * @param Description 视频发布描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 微博可见性，可取值为：
<li>Public：公开，所有人可见；</li>
<li>Private：私有，仅自己可见。</li>

默认为 Public，所有人可见。 
     * @return Visible 微博可见性，可取值为：
<li>Public：公开，所有人可见；</li>
<li>Private：私有，仅自己可见。</li>

默认为 Public，所有人可见。
     */
    public String getVisible() {
        return this.Visible;
    }

    /**
     * Set 微博可见性，可取值为：
<li>Public：公开，所有人可见；</li>
<li>Private：私有，仅自己可见。</li>

默认为 Public，所有人可见。
     * @param Visible 微博可见性，可取值为：
<li>Public：公开，所有人可见；</li>
<li>Private：私有，仅自己可见。</li>

默认为 Public，所有人可见。
     */
    public void setVisible(String Visible) {
        this.Visible = Visible;
    }

    public WeiboPublishInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WeiboPublishInfo(WeiboPublishInfo source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Visible != null) {
            this.Visible = new String(source.Visible);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Visible", this.Visible);

    }
}

