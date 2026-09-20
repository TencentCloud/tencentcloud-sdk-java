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

public class AuditImageDeleteDetail extends AbstractModel {

    /**
    * <p>图片 Id。</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>图片名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>删除状态。<br>0：成功。<br>10104：原图不存在。<br>40201:  图库删图失败。<br>20201:  图库记录删除失败。</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>违规类型。<br>可取值：Normal: 正常 ，Polity: 政治，Porn: 色情，Sexy：性感，Ad: 广告，Illegal: 违法，Abuse: 谩骂，Terror: 暴恐，Spam: 灌水，Moan:呻吟。</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>错误信息。</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get <p>图片 Id。</p> 
     * @return ImageId <p>图片 Id。</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>图片 Id。</p>
     * @param ImageId <p>图片 Id。</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>图片名称</p> 
     * @return Name <p>图片名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>图片名称</p>
     * @param Name <p>图片名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>删除状态。<br>0：成功。<br>10104：原图不存在。<br>40201:  图库删图失败。<br>20201:  图库记录删除失败。</p> 
     * @return Status <p>删除状态。<br>0：成功。<br>10104：原图不存在。<br>40201:  图库删图失败。<br>20201:  图库记录删除失败。</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>删除状态。<br>0：成功。<br>10104：原图不存在。<br>40201:  图库删图失败。<br>20201:  图库记录删除失败。</p>
     * @param Status <p>删除状态。<br>0：成功。<br>10104：原图不存在。<br>40201:  图库删图失败。<br>20201:  图库记录删除失败。</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    /**
     * Get <p>错误信息。</p> 
     * @return ErrMsg <p>错误信息。</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>错误信息。</p>
     * @param ErrMsg <p>错误信息。</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public AuditImageDeleteDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditImageDeleteDetail(AuditImageDeleteDetail source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

