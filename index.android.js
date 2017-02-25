'use strict';

import React from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View
} from 'react-native';

const ScreenOne = (props) => {
    return (
      <View style={styles.container}>
        <Text style={styles.hello}>Screen One</Text>
      </View>
    )
};

var styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
  },
  hello: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
});

const ScreenTwo = (props) => {
    return (
      <View style={styles.container}>
        <Text style={styles.hello}>Screen Two</Text>
      </View>
    )
};

AppRegistry.registerComponent('ScreenOne', () => ScreenOne);
AppRegistry.registerComponent('ScreenTwo', () => ScreenTwo);
