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
package com.tencentcloudapi.bma.v20221115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBPFakeURLsRequest extends AbstractModel{

    /**
    * 仿冒网址下载链接：请严格按照模版要求填写，https://bma-privacy-detection-1251316161.cosgz.myqcloud.com/20221124/ff3273b24104d03fa3a8d0629a7f71a9/批量仿冒网址举报模板.xlsx
    */
    @SerializedName("FakeURLs")
    @Expose
    private String FakeURLs;

    /**
     * Get 仿冒网址下载链接：请严格按照模版要求填写，https://bma-privacy-detection-1251316161.cosgz.myqcloud.com/20221124/ff3273b24104d03fa3a8d0629a7f71a9/批量仿冒网址举报模板.xlsx 
     * @return FakeURLs 仿冒网址下载链接：请严格按照模版要求填写，https://bma-privacy-detection-1251316161.cosgz.myqcloud.com/20221124/ff3273b24104d03fa3a8d0629a7f71a9/批量仿冒网址举报模板.xlsx
     */
    public String getFakeURLs() {
        return this.FakeURLs;
    }

    /**
     * Set 仿冒网址下载链接：请严格按照模版要求填写，https://bma-privacy-detection-1251316161.cosgz.myqcloud.com/20221124/ff3273b24104d03fa3a8d0629a7f71a9/批量仿冒网址举报模板.xlsx
     * @param FakeURLs 仿冒网址下载链接：请严格按照模版要求填写，https://bma-privacy-detection-1251316161.cosgz.myqcloud.com/20221124/ff3273b24104d03fa3a8d0629a7f71a9/批量仿冒网址举报模板.xlsx
     */
    public void setFakeURLs(String FakeURLs) {
        this.FakeURLs = FakeURLs;
    }

    public CreateBPFakeURLsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBPFakeURLsRequest(CreateBPFakeURLsRequest source) {
        if (source.FakeURLs != null) {
            this.FakeURLs = new String(source.FakeURLs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FakeURLs", this.FakeURLs);

    }
}

