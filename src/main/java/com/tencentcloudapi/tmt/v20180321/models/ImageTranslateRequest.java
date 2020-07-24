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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageTranslateRequest extends AbstractModel{

    /**
    * 唯一id，返回时原样返回
    */
    @SerializedName("SessionUuid")
    @Expose
    private String SessionUuid;

    /**
    * doc:文档扫描
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 图片数据的Base64字符串，图片大小上限为4M，建议对源图片进行一定程度压缩
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 源语言，支持语言列表：<li> auto：自动识别（识别为一种语言）</li> <li>zh：简体中文</li> <li>zh-TW：繁体中文</li> <li>en：英语</li> <li>ja：日语</li> <li>ko：韩语</li> <li>ru：俄语</li> <li>fr：法语</li> <li>de：德语</li> <li>it：意大利语</li> <li>es：西班牙语</li> <li>pt：葡萄牙语</li> <li>ms：马来西亚语</li> <li>th：泰语</li><li>vi：越南语</li>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 目标语言，各源语言的目标语言支持列表如下：
<li>zh（简体中文）：en（英语）、ja（日语）、ko（韩语）、ru（俄语）、fr（法语）、de（德语）、it（意大利语）、es（西班牙语）、pt（葡萄牙语）、ms（马来语）、th（泰语）、vi（越南语）</li>
<li>zh-TW（繁体中文）：en（英语）、ja（日语）、ko（韩语）、ru（俄语）、fr（法语）、de（德语）、it（意大利语）、es（西班牙语）、pt（葡萄牙语）、ms（马来语）、th（泰语）、vi（越南语）</li>
<li>en（英语）：zh（中文）、ja（日语）、ko（韩语）、ru（俄语）、fr（法语）、de（德语）、it（意大利语）、es（西班牙语）、pt（葡萄牙语）、ms（马来语）、th（泰语）、vi（越南语）</li>
<li>ja（日语）：zh（中文）、en（英语）、ko（韩语）</li>
<li>ko（韩语）：zh（中文）、en（英语）、ja（日语）</li>
<li>ru：俄语：zh（中文）、en（英语）</li>
<li>fr：法语：zh（中文）、en（英语）</li>
<li>de：德语：zh（中文）、en（英语）</li>
<li>it：意大利语：zh（中文）、en（英语）</li>
<li>es：西班牙语：zh（中文）、en（英语）</li>
<li>pt：葡萄牙语：zh（中文）、en（英语）</li>
<li>ms：马来西亚语：zh（中文）、en（英语）</li>
<li>th：泰语：zh（中文）、en（英语）</li>
<li>vi：越南语：zh（中文）、en（英语）</li>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get 唯一id，返回时原样返回 
     * @return SessionUuid 唯一id，返回时原样返回
     */
    public String getSessionUuid() {
        return this.SessionUuid;
    }

    /**
     * Set 唯一id，返回时原样返回
     * @param SessionUuid 唯一id，返回时原样返回
     */
    public void setSessionUuid(String SessionUuid) {
        this.SessionUuid = SessionUuid;
    }

    /**
     * Get doc:文档扫描 
     * @return Scene doc:文档扫描
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set doc:文档扫描
     * @param Scene doc:文档扫描
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 图片数据的Base64字符串，图片大小上限为4M，建议对源图片进行一定程度压缩 
     * @return Data 图片数据的Base64字符串，图片大小上限为4M，建议对源图片进行一定程度压缩
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 图片数据的Base64字符串，图片大小上限为4M，建议对源图片进行一定程度压缩
     * @param Data 图片数据的Base64字符串，图片大小上限为4M，建议对源图片进行一定程度压缩
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get 源语言，支持语言列表：<li> auto：自动识别（识别为一种语言）</li> <li>zh：简体中文</li> <li>zh-TW：繁体中文</li> <li>en：英语</li> <li>ja：日语</li> <li>ko：韩语</li> <li>ru：俄语</li> <li>fr：法语</li> <li>de：德语</li> <li>it：意大利语</li> <li>es：西班牙语</li> <li>pt：葡萄牙语</li> <li>ms：马来西亚语</li> <li>th：泰语</li><li>vi：越南语</li> 
     * @return Source 源语言，支持语言列表：<li> auto：自动识别（识别为一种语言）</li> <li>zh：简体中文</li> <li>zh-TW：繁体中文</li> <li>en：英语</li> <li>ja：日语</li> <li>ko：韩语</li> <li>ru：俄语</li> <li>fr：法语</li> <li>de：德语</li> <li>it：意大利语</li> <li>es：西班牙语</li> <li>pt：葡萄牙语</li> <li>ms：马来西亚语</li> <li>th：泰语</li><li>vi：越南语</li>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 源语言，支持语言列表：<li> auto：自动识别（识别为一种语言）</li> <li>zh：简体中文</li> <li>zh-TW：繁体中文</li> <li>en：英语</li> <li>ja：日语</li> <li>ko：韩语</li> <li>ru：俄语</li> <li>fr：法语</li> <li>de：德语</li> <li>it：意大利语</li> <li>es：西班牙语</li> <li>pt：葡萄牙语</li> <li>ms：马来西亚语</li> <li>th：泰语</li><li>vi：越南语</li>
     * @param Source 源语言，支持语言列表：<li> auto：自动识别（识别为一种语言）</li> <li>zh：简体中文</li> <li>zh-TW：繁体中文</li> <li>en：英语</li> <li>ja：日语</li> <li>ko：韩语</li> <li>ru：俄语</li> <li>fr：法语</li> <li>de：德语</li> <li>it：意大利语</li> <li>es：西班牙语</li> <li>pt：葡萄牙语</li> <li>ms：马来西亚语</li> <li>th：泰语</li><li>vi：越南语</li>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 目标语言，各源语言的目标语言支持列表如下：
<li>zh（简体中文）：en（英语）、ja（日语）、ko（韩语）、ru（俄语）、fr（法语）、de（德语）、it（意大利语）、es（西班牙语）、pt（葡萄牙语）、ms（马来语）、th（泰语）、vi（越南语）</li>
<li>zh-TW（繁体中文）：en（英语）、ja（日语）、ko（韩语）、ru（俄语）、fr（法语）、de（德语）、it（意大利语）、es（西班牙语）、pt（葡萄牙语）、ms（马来语）、th（泰语）、vi（越南语）</li>
<li>en（英语）：zh（中文）、ja（日语）、ko（韩语）、ru（俄语）、fr（法语）、de（德语）、it（意大利语）、es（西班牙语）、pt（葡萄牙语）、ms（马来语）、th（泰语）、vi（越南语）</li>
<li>ja（日语）：zh（中文）、en（英语）、ko（韩语）</li>
<li>ko（韩语）：zh（中文）、en（英语）、ja（日语）</li>
<li>ru：俄语：zh（中文）、en（英语）</li>
<li>fr：法语：zh（中文）、en（英语）</li>
<li>de：德语：zh（中文）、en（英语）</li>
<li>it：意大利语：zh（中文）、en（英语）</li>
<li>es：西班牙语：zh（中文）、en（英语）</li>
<li>pt：葡萄牙语：zh（中文）、en（英语）</li>
<li>ms：马来西亚语：zh（中文）、en（英语）</li>
<li>th：泰语：zh（中文）、en（英语）</li>
<li>vi：越南语：zh（中文）、en（英语）</li> 
     * @return Target 目标语言，各源语言的目标语言支持列表如下：
<li>zh（简体中文）：en（英语）、ja（日语）、ko（韩语）、ru（俄语）、fr（法语）、de（德语）、it（意大利语）、es（西班牙语）、pt（葡萄牙语）、ms（马来语）、th（泰语）、vi（越南语）</li>
<li>zh-TW（繁体中文）：en（英语）、ja（日语）、ko（韩语）、ru（俄语）、fr（法语）、de（德语）、it（意大利语）、es（西班牙语）、pt（葡萄牙语）、ms（马来语）、th（泰语）、vi（越南语）</li>
<li>en（英语）：zh（中文）、ja（日语）、ko（韩语）、ru（俄语）、fr（法语）、de（德语）、it（意大利语）、es（西班牙语）、pt（葡萄牙语）、ms（马来语）、th（泰语）、vi（越南语）</li>
<li>ja（日语）：zh（中文）、en（英语）、ko（韩语）</li>
<li>ko（韩语）：zh（中文）、en（英语）、ja（日语）</li>
<li>ru：俄语：zh（中文）、en（英语）</li>
<li>fr：法语：zh（中文）、en（英语）</li>
<li>de：德语：zh（中文）、en（英语）</li>
<li>it：意大利语：zh（中文）、en（英语）</li>
<li>es：西班牙语：zh（中文）、en（英语）</li>
<li>pt：葡萄牙语：zh（中文）、en（英语）</li>
<li>ms：马来西亚语：zh（中文）、en（英语）</li>
<li>th：泰语：zh（中文）、en（英语）</li>
<li>vi：越南语：zh（中文）、en（英语）</li>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 目标语言，各源语言的目标语言支持列表如下：
<li>zh（简体中文）：en（英语）、ja（日语）、ko（韩语）、ru（俄语）、fr（法语）、de（德语）、it（意大利语）、es（西班牙语）、pt（葡萄牙语）、ms（马来语）、th（泰语）、vi（越南语）</li>
<li>zh-TW（繁体中文）：en（英语）、ja（日语）、ko（韩语）、ru（俄语）、fr（法语）、de（德语）、it（意大利语）、es（西班牙语）、pt（葡萄牙语）、ms（马来语）、th（泰语）、vi（越南语）</li>
<li>en（英语）：zh（中文）、ja（日语）、ko（韩语）、ru（俄语）、fr（法语）、de（德语）、it（意大利语）、es（西班牙语）、pt（葡萄牙语）、ms（马来语）、th（泰语）、vi（越南语）</li>
<li>ja（日语）：zh（中文）、en（英语）、ko（韩语）</li>
<li>ko（韩语）：zh（中文）、en（英语）、ja（日语）</li>
<li>ru：俄语：zh（中文）、en（英语）</li>
<li>fr：法语：zh（中文）、en（英语）</li>
<li>de：德语：zh（中文）、en（英语）</li>
<li>it：意大利语：zh（中文）、en（英语）</li>
<li>es：西班牙语：zh（中文）、en（英语）</li>
<li>pt：葡萄牙语：zh（中文）、en（英语）</li>
<li>ms：马来西亚语：zh（中文）、en（英语）</li>
<li>th：泰语：zh（中文）、en（英语）</li>
<li>vi：越南语：zh（中文）、en（英语）</li>
     * @param Target 目标语言，各源语言的目标语言支持列表如下：
<li>zh（简体中文）：en（英语）、ja（日语）、ko（韩语）、ru（俄语）、fr（法语）、de（德语）、it（意大利语）、es（西班牙语）、pt（葡萄牙语）、ms（马来语）、th（泰语）、vi（越南语）</li>
<li>zh-TW（繁体中文）：en（英语）、ja（日语）、ko（韩语）、ru（俄语）、fr（法语）、de（德语）、it（意大利语）、es（西班牙语）、pt（葡萄牙语）、ms（马来语）、th（泰语）、vi（越南语）</li>
<li>en（英语）：zh（中文）、ja（日语）、ko（韩语）、ru（俄语）、fr（法语）、de（德语）、it（意大利语）、es（西班牙语）、pt（葡萄牙语）、ms（马来语）、th（泰语）、vi（越南语）</li>
<li>ja（日语）：zh（中文）、en（英语）、ko（韩语）</li>
<li>ko（韩语）：zh（中文）、en（英语）、ja（日语）</li>
<li>ru：俄语：zh（中文）、en（英语）</li>
<li>fr：法语：zh（中文）、en（英语）</li>
<li>de：德语：zh（中文）、en（英语）</li>
<li>it：意大利语：zh（中文）、en（英语）</li>
<li>es：西班牙语：zh（中文）、en（英语）</li>
<li>pt：葡萄牙语：zh（中文）、en（英语）</li>
<li>ms：马来西亚语：zh（中文）、en（英语）</li>
<li>th：泰语：zh（中文）、en（英语）</li>
<li>vi：越南语：zh（中文）、en（英语）</li>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0 
     * @return ProjectId 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0
     * @param ProjectId 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionUuid", this.SessionUuid);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

