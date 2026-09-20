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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditImage extends AbstractModel {

    /**
    * <p>提交的图片顺序索引。</p>
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * <p>图片地址。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>图片 md5 值。</p>
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * <p>图片名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>违规类型。<br>可取值：Normal: 正常 ，Polity: 政治，Porn: 色情，Sexy：性感，Ad: 广告，Illegal: 违法，Abuse: 谩骂，Terror: 暴恐，Spam: 灌水，Moan:呻吟。</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
     * Get <p>提交的图片顺序索引。</p> 
     * @return Index <p>提交的图片顺序索引。</p>
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set <p>提交的图片顺序索引。</p>
     * @param Index <p>提交的图片顺序索引。</p>
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get <p>图片地址。</p> 
     * @return Url <p>图片地址。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>图片地址。</p>
     * @param Url <p>图片地址。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>图片 md5 值。</p> 
     * @return Md5 <p>图片 md5 值。</p>
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set <p>图片 md5 值。</p>
     * @param Md5 <p>图片 md5 值。</p>
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get <p>图片名称。</p> 
     * @return Name <p>图片名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>图片名称。</p>
     * @param Name <p>图片名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>违规类型。<br>可取值：Normal: 正常 ，Polity: 政治，Porn: 色情，Sexy：性感，Ad: 广告，Illegal: 违法，Abuse: 谩骂，Terror: 暴恐，Spam: 灌水，Moan:呻吟。</p> 
     * @return Label <p>违规类型。<br>可取值：Normal: 正常 ，Polity: 政治，Porn: 色情，Sexy：性感，Ad: 广告，Illegal: 违法，Abuse: 谩骂，Terror: 暴恐，Spam: 灌水，Moan:呻吟。</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>违规类型。<br>可取值：Normal: 正常 ，Polity: 政治，Porn: 色情，Sexy：性感，Ad: 广告，Illegal: 违法，Abuse: 谩骂，Terror: 暴恐，Spam: 灌水，Moan:呻吟。</p>
     * @param Label <p>违规类型。<br>可取值：Normal: 正常 ，Polity: 政治，Porn: 色情，Sexy：性感，Ad: 广告，Illegal: 违法，Abuse: 谩骂，Terror: 暴恐，Spam: 灌水，Moan:呻吟。</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    public AuditImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditImage(AuditImage source) {
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Label", this.Label);

    }
}

